package com.desafio.sistemasolar;

import java.util.ArrayList;

public class Planeta implements IPlaneta{
	private String nombre;
	private int tamano;
	private int distanciaSol;
	private ArrayList<Luna> lunas = new ArrayList<Luna>();

	Planeta(String nombre, int tamano, int distanciaSol){
		this.nombre = nombre;
		this.tamano = tamano;
		this.distanciaSol = distanciaSol;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public int getTamano() {
		return this.tamano;
	}

	public void setDistanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public int getDistanciaSol() {
		return this.distanciaSol;
	}

	public ArrayList<Luna> getLunas() {
		return lunas;
	}

	public void setLunas(Luna luna) {
		this.lunas.add(luna);
	}
	
	public String toString() {
		return "Planeta:"+ this.nombre+" está a "+this.distanciaSol+"000 km del sol, su tamaño es de "+this.tamano+" km de diámetro y tiene "+this.lunas.size()+" lunas";
	}
	
}
