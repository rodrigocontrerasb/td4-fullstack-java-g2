package com.desafio.sistemasolar;

import java.util.ArrayList;

public class SistemaSolar {
	
	private ArrayList<Planeta> planetas = new ArrayList<Planeta>();
	
	SistemaSolar(){}
	
	public void agregarPlaneta(Planeta planeta) {
		this.planetas.add(planeta);
	}
	
	public void mostrarPlanetas() {
		for (int i=0; this.planetas.size() < i ;i++) {
			System.out.println(this.planetas.get(i).toString());
		}
	}
	
	public void mostrarPlanetasLunas() {
		for (int i=0; this.planetas.size() > i; i++) {
			System.out.println(this.planetas.get(i).toString());
			for (int j=0; this.planetas.get(i).getLunas().size() > j; j++) {
				System.out.println(this.planetas.get(i).getLunas().get(j).toString());
			}
			System.out.println("-----------------------------------------------------");
		}
	}
}
