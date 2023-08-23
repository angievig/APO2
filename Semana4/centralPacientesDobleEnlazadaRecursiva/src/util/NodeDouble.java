package util;

/**
 * Clase que implementa un nodo doble usando Object para el contenido
 * extiende la clase NodeSingle con la referencia al nodo anterior, el constructor
 * getters y setters respectivos
 * @author angievig
 * @version 1.0
 * @since August 2023
 */

public class NodeDouble extends NodeSingle{
	
	/**
	 * enlace al nodo anterior
	 */
	private NodeDouble prev;
	
	/**
	 * Constructor
	 * @param c es el contenido del nodo
	 */

	public NodeDouble(Object c) {
		super(c);
		prev = null;
		
	}

	public NodeSingle getPrev() {
		return prev;
	}

	public void setPrev(NodeDouble prev) {
		this.prev = prev;
	}

}
