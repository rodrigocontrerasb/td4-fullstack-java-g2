package com.desafio.sistemasolar;

public class Main {

	public static void main(String[] args) {
		
		// Creo las lunas
		Luna lunaTierra = new Luna("Luna", 3476, 27322);
		Luna lunaMarte1 = new Luna("Deimos", 8, 1263);
		Luna lunaMarte2 = new Luna("Phobos", 560, 0.319);
		Luna lunaJupiter1 = new Luna("Adrastea", 416, 0.298);
		Luna lunaJupiter2 = new Luna("Aitne", 3, 736);
		Luna lunaSaturno1 = new Luna("Aegir", 6, 1116.5);
		Luna lunaSaturno2 = new Luna("Albiorix", 30, 783);
		Luna lunaUrano1 = new Luna("Ariel", 1160, 2.520);
		Luna lunaUrano2 = new Luna("Belinda", 66, 0.624);
		Luna lunaNeptuno1 = new Luna("Despina", 160, 0.40);
		Luna lunaNeptuno2 = new Luna("Galatea", 140, 0.33);
		Luna lunaPluton1 = new Luna("Charon", 1207, 6.387);
		Luna lunaPluton2 = new Luna("Nix", 130, 24.856);
		
		// Creo los planetas con sus respectivas lunas
		Planeta mercurio = new Planeta("Mercurio", 4880, 5791);
		Planeta venus = new Planeta("Venus", 12104, 108200);
		Planeta tierra = new Planeta("La Tierra", 12756, 149600);
		tierra.setLunas(lunaTierra);
		Planeta marte = new Planeta("Marte", 6794, 227940000);
		marte.setLunas(lunaMarte1);
		marte.setLunas(lunaMarte2);
		Planeta jupiter = new Planeta("Júpiter", 142984, 778330);
		jupiter.setLunas(lunaJupiter1);
		jupiter.setLunas(lunaJupiter2);
		Planeta saturno = new Planeta("Saturno", 108728, 1429400);
		saturno.setLunas(lunaSaturno1);
		saturno.setLunas(lunaSaturno2);
		Planeta urano = new Planeta("Urano", 51118, 2870990);
		urano.setLunas(lunaUrano1);
		urano.setLunas(lunaUrano2);
		Planeta neptuno = new Planeta("Neptuno", 49532, 4504300);
		neptuno.setLunas(lunaNeptuno1);
		neptuno.setLunas(lunaNeptuno2);
		Planeta pluton = new Planeta("Plutón", 2320, 5913520);
		pluton.setLunas(lunaPluton1);
		pluton.setLunas(lunaPluton2);
		
		
		// agrego las lunas al sistema solar
		SistemaSolar ss = new SistemaSolar();
		ss.agregarPlaneta(mercurio);
		ss.agregarPlaneta(venus);
		ss.agregarPlaneta(tierra);
		ss.agregarPlaneta(marte);
		ss.agregarPlaneta(jupiter);
		ss.agregarPlaneta(saturno);
		ss.agregarPlaneta(urano);
		ss.agregarPlaneta(neptuno);
		ss.agregarPlaneta(pluton);
		
		ss.mostrarPlanetasLunas();
		
	}

}
