package com.batalla;

public class Torneo {

	Personaje p1;
	Personaje p2;

	Torneo(Personaje p1, Personaje p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public void pelea() {
		p1.avanzar();
		p1.izquierda();
		p1.izquierda();
		p2.avanzar();
		p2.retroceder();
		p2.ataqueBasico();
		p1.esquivarAtaque();
		p1.ataqueAvanzado();
		p2.defenderAtaque();
	}

	public void presentarContrincantes() {
		p1.toString();
		p2.toString();
		
	}

}
