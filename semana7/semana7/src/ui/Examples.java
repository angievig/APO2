package ui;

public class Examples {

	public static void main(String[] args) {
		
		try {
		    // Código que puede generar una excepción
		} catch (TipoDeExcepcion e) {
		    // Código para manejar la excepción
		}
		
		try {
		    // Código que puede generar una excepción
		} catch (TipoDeExcepcion1 e) {
		    // Manejar TipoDeExcepcion1
		} catch (TipoDeExcepcion2 e) {
		    // Manejar TipoDeExcepcion2
		} catch (TipoDeExcepcion3 e) {
		    // Manejar TipoDeExcepcion3
		} finally {
		    // Código que se ejecuta siempre
		}
	}

}
