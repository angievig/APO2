package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		//ejemploCrear();
		//ejemploLeer();
		//ejemploCadenas();
		//ejemploEscribir() ;
		

	}
	public static void ejemploCrear() {
		File archivo = new File("data/ejemplo.txt"); // Crea una instancia para el archivo "ejemplo.txt"
		System.out.println(archivo.exists());
		
		// Crea una instancia para el directorio "directorioEjemplo"
		File directorio = new File("directorioEjemplo"); 
		// Verifica si el archivo existe
		boolean existe = archivo.exists(); 
		// Verifica si es un directorio
		boolean esDirectorio = directorio.isDirectory(); 
		System.out.println(esDirectorio);
		// Verifica si es un archivo
		boolean esArchivo = archivo.isFile(); 
		// Obtiene el nombre del archivo o directorio
		String nombre = archivo.getName(); 
		// Obtiene la ruta absoluta del archivo o directorio
		String rutaAbsoluta = archivo.getAbsolutePath(); 
	}
	
	public static void ejemploLeer() {
		
		File archivo = new File("data/ejemplo.txt");
		
		
		try {
			BufferedReader lector = new BufferedReader(
					new FileReader(archivo)) ;

			String linea;
			while ((linea = lector.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: "+ e.getMessage());
		}
	}
	
	public static void ejemploCadenas() {
		//Con split
		String[] result = "this is a test".split("\\s");
	     for (int x=0; x<result.length; x++)
	         System.out.println(result[x]);
	   
	     //Con stringtokenizer
	     StringTokenizer st = new StringTokenizer("this is a test");
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
	}
	
	public static void ejemploEscribir() {
		File salidaFile= new File("data/salida.txt");
		
		try {
			//Creando el nuevo archivo
			salidaFile.createNewFile();
			//Creando el objeto escritor
			BufferedWriter escritor = new BufferedWriter(
					new FileWriter(salidaFile));
            String texto = "Este es un ejemplo de escritura en un archivo.";
            escritor.write(texto);
            escritor.flush();
            escritor.close();
            System.out.println("Texto escrito con éxito en el archivo.");

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
		
		
	}

}
