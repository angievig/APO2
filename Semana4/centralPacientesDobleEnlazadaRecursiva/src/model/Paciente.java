package model;

import java.util.Date;

/**
 * Clase que representa un paciente, ejemplo simplificado del caso de estudio del texto
 * @author angievig
 * @version 1.0
 * @since August 2023
 */

public class Paciente {
	/**
	 * identificador del paciente
	 */
	private int codigo;
	/**
	 * fecha de nacimiento, para calcular la edad
	 */
	private Date fechaNacimiento;
	/**
	 * nombre del paciente
	 */
	private String name;

	
	

	public Paciente(int codigo, Date fechaNacimiento, String name) {
		this.codigo = codigo;
		this.fechaNacimiento = fechaNacimiento;
		this.name = name;
		
	}
	
	public Paciente(int codigo) {
		this.codigo = codigo;
		this.name = "dummy name";
		fechaNacimiento= new Date();
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		boolean out= false;
		
		out= (int)obj == this.codigo;
		return out;
	}

	@Override
	public String toString() {
		return "Paciente: {"+codigo + ", " + name+"}";
	}
	
	
	


	
	

	

}
