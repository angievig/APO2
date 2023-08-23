package util;

/**
 * Clase que implementa una lista doblemente enlazada 
 * implementa la interfaz Lista
 * @author angievig
 * @version 1.0
 * @since August 2023
 */

public class DoubleLinkedList extends SingleLinkedList {
	/**
	 * referencia al primer elemento de la lista
	 */
	private NodeDouble first;
	
	/**
	 * Referencia al Ultimo elemento de la lista
	 */
	private NodeDouble last;
	
	/**
	 * entero que guarda la cantidad de elementos de la lista
	 */
	private int numItems;



	@Override
	//FIXME needs test
	public void addFirst(Object n) {
		NodeDouble newNode= new NodeDouble(n);
		
		if(first ==null) {// empty list
			first =newNode;
			last= newNode;
		} else {
			newNode.setNext(first);
			first.setPrev(newNode);
			first= newNode;
		}
		numItems++;
	}

	@Override
	public void addLast(Object n) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Object clave) {
		// TODO Auto-generated method stub
		
	}

}
