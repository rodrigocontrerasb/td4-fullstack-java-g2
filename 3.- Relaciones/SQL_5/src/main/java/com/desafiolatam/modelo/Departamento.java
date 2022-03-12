package com.desafiolatam.modelo;

public class Departamento {

	// Atributos
	private int numDepto;
	private String nombreDepto;
	private String ubicacionDepto;

	// Getters y Setters
	public int getNumDepto() {
		return numDepto;
	}

	public void setNumDepto(int numDepto) {
		this.numDepto = numDepto;
	}

	public String getNombreDepto() {
		return nombreDepto;
	}

	public void setNombreDepto(String nombreDepto) {
		this.nombreDepto = nombreDepto;
	}

	public String getUbicacionDepto() {
		return ubicacionDepto;
	}

	public void setUbicacionDepto(String ubicacionDepto) {
		this.ubicacionDepto = ubicacionDepto;
	}

	
	// Constructor
	public Departamento(int numDepto, String nombreDepto, String ubicacionDepto) {
		super();
		this.numDepto = numDepto;
		this.nombreDepto = nombreDepto;
		this.ubicacionDepto = ubicacionDepto;
	}
	
	
	
	

}
