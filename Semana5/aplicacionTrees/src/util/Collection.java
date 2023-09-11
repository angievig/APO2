package util;

/**
 * Interfaz que define las operaciones básicas de una colecciOn
 * @author angievig
 * @version 1.0
 * @since August 2023
 */

public interface Collection {
	
	public boolean isEmpty();
	public void add(Object n);
	public Object search(Object clave);
}
