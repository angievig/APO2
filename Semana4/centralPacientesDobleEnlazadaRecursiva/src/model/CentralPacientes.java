package model;

import java.util.Date;

import util.LinkedListRecursive;
import util.SingleLinkedList;

/**
 * Clase controladora del caso de estudio del texto
 * @author angievig
 * @version 1.0
 * @since August 2023
 */
public class CentralPacientes {
	LinkedListRecursive pacientes;
	
	
	public CentralPacientes() {
		pacientes = new LinkedListRecursive();
	}


	/**	
	 * Informa si un paciente está registrado en la central de pacientes
	 * @param code, código del paciente
	 * @return String con el mensaje
	 */
	public String buscarPaciente(int code) {
		String out= "El paciente con codigo " + code+ " no está registrado";
		Paciente p = (Paciente)pacientes.search(code);
		
		if (p!=null)
			out= "El paciente con cOdigo " + code + " está registrado" ;
		
		return out;
	}

	//FIXME completar con los otros parAmetros del paciente
	public String agregarPaciente(int code) {
		String out= "";
		
		Paciente p = (Paciente)pacientes.search(code);
			if (p==null) {
				pacientes.addFirst(new Paciente(code));
				out= "El paciente con cOdigo " + code + " fue correctamente agregado"; 
			}else {
				out= "Error: el paciente con cOdigo " + code + " ya está registrado";
			}
				
		return out;
	}
	
	public String eliminarPaciente(int code) {
		String out= "";
		Paciente p = (Paciente)pacientes.search(code);
		
		if (p!=null) {
			pacientes.delete(p.getCodigo());
			out= "El paciente con cOdigo " + code + " fue correctamente eliminado"; 
		}else {
			out= "Error: el paciente con cOdigo " + code + " no está registrado";
		}
		return out;
	
	}
	
	public String printPacientes() {
		return pacientes.print();
		
	}
	
	
	
}
