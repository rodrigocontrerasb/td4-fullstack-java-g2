package com.beansejemplo2.beans;

import org.springframework.beans.factory.annotation.Value;

public class Persona {

	@Value("Ivan Zamorano")
	private String nombre;
	@Value("40")
	private int edad;

	Persona() {
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
