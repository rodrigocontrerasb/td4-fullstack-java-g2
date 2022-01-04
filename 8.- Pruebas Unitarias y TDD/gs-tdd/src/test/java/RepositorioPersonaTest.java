import repositoio.RepositorioPersona;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import modelos.Persona;

public class RepositorioPersonaTest {

	private RepositorioPersona repositorioPersona = mock(RepositorioPersona.class);
	// private RepositorioPersona repositorioPersona = new RepositorioPersona();

	@Test
	public void testCrearPersona() {
		Persona pepe = new Persona("1-2", "Pepe");
		Persona jose = new Persona("3-4", "Jose");

		when(repositorioPersona.crearPersona(pepe)).thenReturn("OK");
		String crearPersonaRes = repositorioPersona.crearPersona(pepe);

		System.out.println("SALIDA --> " + crearPersonaRes);

		assertEquals("OK", crearPersonaRes);
		verify(repositorioPersona).crearPersona(pepe);
		// verify(repositorioPersona).crearPersona(jose);
	}

	@Test
	public void testActualizarPersona() {
		Persona juanito = new Persona("1-2", "Juanito");
		when(repositorioPersona.actualizarPersona(juanito)).thenReturn("OK");
		String actualizarRes = repositorioPersona.actualizarPersona(juanito);
		assertEquals("OK", actualizarRes);
		verify(repositorioPersona).actualizarPersona(juanito);
	}

	@Test
	public void testEliminarPersona() {
		Persona sam = new Persona("1-4", "Sam");
		when(repositorioPersona.eliminarPersona(sam)).thenReturn("OK");
		String eliminarRes = repositorioPersona.eliminarPersona(sam);
		assertEquals("OK", eliminarRes);
		verify(repositorioPersona).eliminarPersona(sam);
	}

	@Test
	public void testListarPersona() {
		Map<String, String> mockRespuesta = new HashMap();
		when(repositorioPersona.listarPersonas()).thenReturn(mockRespuesta);
		Map<String, String> listarRes = repositorioPersona.listarPersonas();
		assertEquals(mockRespuesta, listarRes);
		verify(repositorioPersona).listarPersonas();
	}

}
