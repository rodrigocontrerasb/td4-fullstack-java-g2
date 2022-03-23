package com.desafio.sistemasolar;

public class Luna implements ILuna {
	private String nombre;
	private int diametro;
	private double tiempoOrbita;
	
	public Luna (String nombre, int diametro, double tiempoOrbita) {
		this.nombre = nombre;
		this.diametro = diametro;
		this.tiempoOrbita = tiempoOrbita;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDiametro() {
		return this.diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getTiempoOrbita() {
		return this.tiempoOrbita;
	}

	public void setTiempoOrbita(double tiempoOrbita) {
		this.tiempoOrbita = tiempoOrbita;
	}
	public String toString() {
		return "Luna de nombre "+this.nombre+" que mide "+this.diametro+" km de diámetro y el tiempo de órbita es de "+this.tiempoOrbita+" días.";
	}

}
