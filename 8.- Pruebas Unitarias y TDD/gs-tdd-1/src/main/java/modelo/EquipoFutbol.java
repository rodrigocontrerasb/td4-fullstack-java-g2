package modelo;

public class EquipoFutbol {

	private int juegosGanados;
	private int juegosPerdidos;
	private int juegosEmpatados;

	public EquipoFutbol(int juegosGanados, int juegosPerdidos, int juegosEmpatados) {
		this.juegosGanados = juegosGanados;
		this.juegosPerdidos = juegosPerdidos;
		this.juegosEmpatados = juegosEmpatados;
	}

	public int getJuegosGanados() {
		return juegosGanados;
	}

	public int getJuegosPerdidos() {
		return juegosPerdidos;
	}

	public int getJuegosEmpatados() {
		return juegosEmpatados;
	}

}
