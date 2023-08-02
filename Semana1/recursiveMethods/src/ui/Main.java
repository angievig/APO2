package ui;

import model.RecursiveMethods;
import java.util.Scanner;

/**
 * Clase principal del proyecto
 * @author angievig
 * @version 1.0
 * @since August 2023
 */
public class Main {

    /**
     * con es la asociación con la clse controladora del modelo
	 */
    private RecursiveMethods con;
    /**
     * sc es el objeto que permite leer informaciOn digitada por el usuario
     */
    private Scanner sc;

    /**
     * Constructor de la clase, no recibe prametros.
     * El mEtodo inicializa el objeto lector
     */
    public Main() {
        //iniciando objetos
        sc= new Scanner(System.in);
        con = new RecursiveMethods();
    }


    public static void main (String[] a){
        // creando un objeto de la clase principal
        Main obPpal = new Main();
        // variable para leer la entrada
        int option= 0;

        //ciclo para ejecutar el menu mientras que el usuario no
        // elija la opciOn para salir (0)
        do {
            option =obPpal.showMenuAndGetOption();
            obPpal.answerOption(option);
        }while (option !=0);


    }


    /**
     * Metodo que se encarga de llamar a los mEtodos que resuelven cada uno de los
     * requerimientos de la aplicaciOn
     * @param userOption, int es el nUmero ingresado por el usuario (no ha sido validado)
     */
    public void answerOption(int userOption) {
        switch(userOption) {
            case 0:
                System.out.println("cerrando la aplicaciOn, bye");
                break;
            case 1:
                factorial();
                break;
            case 2:
                factorialIterativo();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:

        }


    }

    private void factorialIterativo() {
        System.out.println("\ndigite un número");
        int num= sc.nextInt();
        System.out.println(con.factorialIterative(num, 1));
    }

    private void factorial() {
        System.out.println("\ndigite un número");
        int num= sc.nextInt();
        System.out.println(con.factorial(num));
    }

    /**
     * Metodo que muestra el menu de la aplicaciOn, a este metod hace falta implementar la validaciOn
     * del valor ingresado por el usuario
     * @return input, int es la opciOn elegida por el usuario
     */
    public int showMenuAndGetOption() {
        int input;
        System.out.println("\n\nMenu de la aplicación, digite una opciOn\n"+
                "(1) factorial\n" +
                "(2) factorial Iterativo 2\n" +
                "(3) opciOn 3\n"+
                "(4) opciOn 4\n"+
                "(5) opciOn 5\n"+
                "(0) Para salir"

        );
        input = sc.nextInt();
        sc.nextLine();
        return input;
    }


}
