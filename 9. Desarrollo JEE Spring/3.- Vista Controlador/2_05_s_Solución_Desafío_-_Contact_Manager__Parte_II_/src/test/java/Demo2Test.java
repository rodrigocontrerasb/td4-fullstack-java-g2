import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void resultadoEsCero() {
		assertEquals(0, 1 - 1);
	}

	@Test
	public void resultadoNoEsCero() {
		assertNotEquals(0, 1 - 2);
	}

	@Test
	public void resultadoEsVerdadero() {
		assertTrue(1 < 2);
	}

	@Test
	public void resultadoEsNull() {
		
		String nombre = null;
		
		assertNull(nombre);
	}

}
