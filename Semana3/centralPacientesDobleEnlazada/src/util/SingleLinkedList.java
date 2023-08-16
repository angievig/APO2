package util;


/**
 * Clase que implementa una lista con nodos enlazados, 
 * implementa la interfaz Lista
 * Esta versiOn de la lista incluye una referencia al 
 * ultimo elemento de la lista para reducir la cantidad de operaciones
 * en algunos casos.
 * @author angievig
 * @version 1.1
 * @since August 2023
 */

public class SingleLinkedList implements List {
	/**
	 * referencia al primer elemento de la lista
	 */
	private NodeSingle first;
	
	/**
	 * Referencia al Ultimo elemento de la lista
	 */
	private NodeSingle last;
	
	/**
	 * entero que guarda la cantidad de elementos de la lista
	 */
	private int numItems;
	
	
	
	public SingleLinkedList() {
		first= null;
		last =null;
		numItems = 0;
	}
	
	/**
	 * Informa si la lista estA vacIA
	 */
	@Override
	public boolean isEmpty() {
		return (first== null);
	}
	
	@Override
	public void addFirst(Object n) {
		NodeSingle nuevo = new NodeSingle(n);
		
		if (first == null) { // si la lista es vacIa first y nuevo apuntan al mismo nodo
			last = nuevo;
		}
		nuevo.setNext(first);
		first= nuevo;
		numItems++;
	}

	@Override
	//FIXME cambiar el algoritmo
	public void addLast(Object content) {
		NodeSingle actual= first;
		NodeSingle nuevo = new NodeSingle(content);
		
		if (first ==null) { //Si la lista es vacIa el nuevo es el primero y el ultimo
			first = nuevo;
			last = nuevo;
			numItems++;
			
		}else { //Se encuentra el ultimo nodo
//			while(actual.getNext() != null) {
//				actual=actual.getNext();
//			}
//			actual.setNext(nuevo);
//			last = nuevo; // se actualiza la referencia al ultimo
//			numItems++;
			
			last.setNext(nuevo);
			last = nuevo; // se actualiza la referencia al ultimo
			numItems++;
			
		}
	}

	@Override
	public Object search(Object clave) {
		Object found =  null;
		NodeSingle actual= first;
		
		if (first !=null) { //Si la lista es no es vacIA se hace el recorrido
			
			while(actual.getNext() != null && found==null) {
				if (actual.getContent().equals(clave))
					found = actual.getContent();
				actual=actual.getNext();
			}
			//si se llegO al ultimo nodo y aun no se encuentra la clave 
			if (actual.getNext()==null && found==null) {
				if (actual.getContent().equals(clave)) //buscando en el ultimo nodo
					found = actual.getContent();
			}
		} // si la lista es vacía no se hace nada
		
		return found;
	}

	@Override
	//FIXME actualizar la referencia al Ultimo
	public void delete(Object clave) {		
		if (first != null) {
			NodeSingle actual, anterior;
			anterior=first;
			actual= first.getNext();
			boolean found= false;
			
			if(first.getContent().equals(clave)) { //quiero eliminar el primero
					first =actual;
					numItems--;
			}
			else {		
				//Se hace el recorrido hasta encontrar el nodo
				while(actual!=null && !found) {
					if(actual.getContent().equals(clave)) {
						found= true;
						anterior.setNext(actual.getNext());
						actual.setNext(null);
						numItems--;
					}
					actual= actual.getNext();
					anterior= anterior.getNext();
				}
			}
		}else {
			//FIXME generar una excepción para las listas vacías
		} 
	}
	
	@Override
	public String toString() {
		String out="size: "+numItems + " [";
		NodeSingle actual= first;
		
		if (first !=null) { //si la lista no es vacia
			while(actual.getNext() != null) {
				out+= actual.toString() + " ";
				actual=actual.getNext();
			}
			out+= actual.toString(); //se incluye el ultimo
			
		}//Si la lista es vacIa no se hace nada

		return out + "]";
	}
}
