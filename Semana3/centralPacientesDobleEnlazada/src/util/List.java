package util;
/**
 * Interfaz que define las operaciones básicas de una lista
 * @author angievig
 * @version 1.0
 * @since August 2023
 */
public interface List {
	public boolean isEmpty();
	public void addFirst(Object n);
	public void addLast(Object n);
	public Object search(Object clave);
	public void delete(Object clave);

}
