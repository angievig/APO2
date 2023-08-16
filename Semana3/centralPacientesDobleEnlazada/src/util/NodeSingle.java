package util;

import model.Paciente;
/**
 * Clase que implementa un nodo simple usando Object para el contenido
 * @author angievig
 * @version 1.0
 * @since August 2023
 */
public class NodeSingle implements Node {
	/**
	 * Objeto del nodo 
	 */
	private Object content;
	/**
	 * referencia para enlazar el siguiente
	 */
	private NodeSingle next;
	
	
	/**
	 * constructor
	 * @param c es un objeto, el contenido del nodo
	 */
	public NodeSingle(Object c) {
		content= c;
		next = null;
	}


	@Override
	public Object getContent() {
		return content;
	}


	@Override
	public void setContent(Object p) {
		content = p;
	}


	public NodeSingle getNext() {
		return next;
	}


	public void setNext(NodeSingle siguiente) {
		this.next = siguiente;
	}
	@Override
	public String toString() {
		return "Nodo: {" + content.toString()+ "}";
	}
	
	

}
