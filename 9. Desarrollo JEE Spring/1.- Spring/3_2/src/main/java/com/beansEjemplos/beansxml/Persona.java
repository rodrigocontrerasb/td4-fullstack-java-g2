package com.beansEjemplos.beansxml;

public class Persona {

	private String nombre;
	private int edad;

	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString() {
		return "Nombre: " + this.nombre + ", Edad:" + this.edad;
	}

}
