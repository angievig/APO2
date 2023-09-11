package model;

public class Calculator {
	
	public  int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
	
	//Sin declaración de excepción
	public  double calcularRaizCuadradaV1(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException(
            		"No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }
	
	//Con declaración de excepción
	public  double calcularRaizCuadradaV2(double numero) throws Exception {
        if (numero < 0) {
            throw new Exception(""
            		+ "No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }

}
