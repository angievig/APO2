package util;

import model.Paciente;
/**
 * Clase que implementa un nodo simple usando Object para el contenido
 * @author angievig
 * @version 1.0
 * @since August 2023
 */
public class Nodo {
	/**
	 * Objeto del nodo 
	 */
	private Object contenido;
	/**
	 * referencia para enlazar el siguiente
	 */
	private Nodo siguiente;
	
	
	/**
	 * constructor
	 * @param c es un objeto, el contenido del nodo
	 */
	public Nodo(Object c) {
		contenido= c;
		siguiente = null;
	}


	public Object getContenido() {
		return contenido;
	}


	public void setContenido(Object p) {
		contenido = p;
	}


	public Nodo getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	@Override
	public String toString() {
		return "Nodo: {" + contenido.toString()+ "}";
	}
	
	

}
