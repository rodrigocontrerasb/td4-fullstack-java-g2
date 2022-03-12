package com.desafiolatam.modelo;

public class Empleado {

	// Atributos
	private int numEmpleado;
	private String nombreEmpleado;
	private int numDepto;

	// Getters y Setters
	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getNumDepto() {
		return numDepto;
	}

	public void setNumDepto(int numDepto) {
		this.numDepto = numDepto;
	}

	
	// Constructor
	public Empleado(int numEmpleado, String nombreEmpleado, int numDepto) {
		super();
		this.numEmpleado = numEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.numDepto = numDepto;
	}
	
	
	
	

}
