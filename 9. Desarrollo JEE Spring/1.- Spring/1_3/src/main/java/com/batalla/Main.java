package com.batalla;

public class Main {

	public static void main(String[] args) {
		Personaje goku = new Personaje("GOK�", 5, 10);
		Personaje vegeta = new Personaje("VEGETA", 6, 9);
		Torneo torneo = new Torneo(goku, vegeta);
		torneo.presentarContrincantes();
		torneo.pelea();
	}

}
