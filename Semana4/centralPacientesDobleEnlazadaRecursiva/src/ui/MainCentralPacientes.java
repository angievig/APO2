package ui;

import  model.CentralPacientes;
import java.util.Scanner;

/**
 * Clase principal del proyecto
 * @author angievig
 * @version 1.0
 * @since August 2023
 */
public class MainCentralPacientes {

    /**
     * con es la asociación con la clse controladora del modelo
	 */
    private CentralPacientes central;
    /**
     * sc es el objeto que permite leer informaciOn digitada por el usuario
     */
    private Scanner sc;

    /**
     * Constructor de la clase, no recibe prametros.
     * El mEtodo inicializa el objeto lector
     */
    public MainCentralPacientes() {
        //iniciando objetos
        sc= new Scanner(System.in);
        central = new CentralPacientes();
    }


    public static void main (String[] a){
        // creando un objeto de la clase principal
        MainCentralPacientes obPpal = new MainCentralPacientes();
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
            	agregarPaciente();
                break;
            case 2:
            	buscarPaciente();
                break;
            case 3:
            	eliminarPaciente();
                break;
            case 4:
            	printPacientes();
                break;
            case 5:

        }


    }
    private void printPacientes() {
		System.out.println("Lista de pacientes");
		System.out.println(central.printPacientes());
		
	}


	private void eliminarPaciente() {
    	System.out.println("Digite el código del paciente que desea eliminar");
    	int code = sc.nextInt();
    	String output = central.eliminarPaciente(code);
    	System.out.println(output);

	}


	private void buscarPaciente() {
		System.out.println("Digite el código del paciente que desea buscar");
    	int code = sc.nextInt();
    	String output = central.buscarPaciente(code);
    	System.out.println(output);
		
	}


	private void agregarPaciente() {
		//FIXME completar con los otros atributos del paciente
		System.out.println("Digite el código del paciente que desea crear");
    	int code = sc.nextInt();
    	String output = central.agregarPaciente(code);
    	System.out.println(output);
		
	}


	/**
     * Metodo que muestra el menu de la aplicaciOn, a este metod hace falta implementar la validaciOn
     * del valor ingresado por el usuario
     * @return input, int es la opciOn elegida por el usuario
     */
    public int showMenuAndGetOption() {
        int input;
        System.out.println("\n\nMenu de la aplicación, digite una opciOn\n"+
                "(1) agregar paciente\n" +
                "(2) buscar paciente\n" +
                "(3) eliminar paciente\n"+
                "(4) Imprimir lista de pacientes\n"+
                "(5) opciOn 5\n"+
                "(0) Para salir"

        );
        input = sc.nextInt();
        sc.nextLine();
        return input;
    }


}
