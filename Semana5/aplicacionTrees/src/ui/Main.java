package ui;

import util.BST;

/**
 * Clase principal del proyecto
 * @author angievig
 * @version 1.0
 * @since August 2023
 */
public class Main {
	public static void main (String[] a){
		BST tree = new BST();
		System.out.println("Ejecución");
		
		System.out.println("imprimir un árbol vacío");
		System.out.println(tree.print());
		
		System.out.println("M".compareTo("D"));
//		
//		tree.add("M");
//		tree.add("D");
//		tree.add("P");
		
		tree.add(10);
		tree.add(4);
		tree.add(16);
		tree.add(2);
		

		
		System.out.println(tree.print());
		
	}

}
