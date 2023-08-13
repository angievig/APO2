package util;
/**
 * Interfaz que define las operaciones básicas de una lista
 * @author angievig
 * @version 1.0
 * @since August 2023
 */
public interface Lista {
	public boolean esVacia();
	public void agregarPrimero(Object n);
	public void agregarUltimo(Object n);
	public Object buscar(Object clave);
	public void eliminar(Object clave);

}
