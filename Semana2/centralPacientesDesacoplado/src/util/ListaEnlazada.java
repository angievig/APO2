package util;


/**
 * Clase que implementa una lista con nodos enlazados, 
 * implementa la interfaz Lista
 * @author angievig
 * @version 1.0
 * @since August 2023
 */

public class ListaEnlazada implements Lista {
	/**
	 * referencia al primer elemento de la lista
	 */
	private Nodo primero;
	/**
	 * entero que guarda la cantidad de elementos de la lista
	 */
	private int numElementos;
	
	
	
	public ListaEnlazada() {
		primero= null;
		numElementos = 0;
	}
	
	/**
	 * Informa si la lista estA vacIA
	 */
	@Override
	public boolean esVacia() {
		return (primero== null);
	}
	
	@Override
	public void agregarPrimero(Object n) {
		// TODO conectar el nuevo nodo y actualizar la cantidad de pacientes
		
	}

	@Override
	public void agregarUltimo(Object content) {
		Nodo actual= primero;
		Nodo nuevo = new Nodo(content);
		
		if (primero ==null) { //Si la lista es vacIa el nuevo es el primero
			primero = nuevo;
			numElementos++;
			
		}else { //Se encuentra el ultimo nodo
			while(actual.getSiguiente() != null) {
				actual=actual.getSiguiente();
			}
			actual.setSiguiente(nuevo);	
			//FIXME incrementar la cantidad de elementos cada que se agrega un nodo
			numElementos++;
			
		}
		
		
		
	}

	@Override
	public Object buscar(Object clave) {
		Object found =  null;
		Nodo actual= primero;
		
		if (primero !=null) { //Si la lista es no es vacIA se hace el recorrido
			
			while(actual.getSiguiente() != null && found==null) {
				if (actual.getContenido().equals(clave))
					found = actual.getContenido();
				actual=actual.getSiguiente();
			}
			//si se llegO al ultimo nodo y aun no se encuentra la clave 
			if (actual.getSiguiente()==null && found==null) {
				if (actual.getContenido().equals(clave)) //buscando en el ultimo nodo
					found = actual.getContenido();
			}
		} // si la lista es vacía no se hace nada
		
		return found;
	}

	@Override
	public void eliminar(Object clave) {
		// TODO buscar el nodo por clave y luego desconectar el nodo
		//FIXME lanzar excepción cuando la lista esté vacía

		
		if (primero != null) {
			Nodo actual, anterior;
			anterior=primero;
			actual= primero.getSiguiente();
			boolean found= false;
			
			if(primero.getContenido().equals(clave)) { //quiero eliminar el primero
					primero =actual;
					numElementos--;
			}
			else {		
				//Se hace el recorrido hasta encontrar el nodo
				while(actual!=null && !found) {
					if(actual.getContenido().equals(clave)) {
						found= true;
						anterior.setSiguiente(actual.getSiguiente());
						actual.setSiguiente(null);
						numElementos--;
					}
					actual= actual.getSiguiente();
					anterior= anterior.getSiguiente();
				}
			}

		}else {
			//FIXME generar una excepción para las listas vacías
		} 
	
		
	}
	
	@Override
	public String toString() {
		String out="size: "+numElementos + " [";
		Nodo actual= primero;
		
		if (primero !=null) { //si la lista no es vacia
			while(actual.getSiguiente() != null) {
				out+= actual.toString() + " ";
				actual=actual.getSiguiente();
			}
			out+= actual.toString(); //se incluye el ultimo
			
		}//Si la lista es vacIa no se hace nada
		
		
		
		return out + "]";
	}




}
