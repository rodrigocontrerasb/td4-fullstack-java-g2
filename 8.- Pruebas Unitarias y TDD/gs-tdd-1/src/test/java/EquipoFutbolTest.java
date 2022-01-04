
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import modelo.EquipoFutbol;

public class EquipoFutbolTest {

	private static final int CUATRO_JUEGOS_GANADOS = 4;
	private static final int CINCO_JUEGOS_EMPATADOS = 5;
	private static final int TRES_JUEGOS_PERDIDOS = 3;

	/*
	 * @Test public void constructorDebeSetearJuegosGanados() { EquipoFutbol team =
	 * new EquipoFutbol(CUATRO_JUEGOS_GANADOS);
	 * assertEquals(CUATRO_JUEGOS_GANADOS,team.getJuegosGanados());
	 * 
	 * }
	 */

	@Test
	public void constructorDebeSetearJuegosGanados() {
		EquipoFutbol team = new EquipoFutbol(CUATRO_JUEGOS_GANADOS, TRES_JUEGOS_PERDIDOS, CINCO_JUEGOS_EMPATADOS);
		assertEquals(CUATRO_JUEGOS_GANADOS, team.getJuegosGanados());
		assertEquals(TRES_JUEGOS_PERDIDOS, team.getJuegosPerdidos());
		assertEquals(CINCO_JUEGOS_EMPATADOS, team.getJuegosEmpatados());
	}

}
