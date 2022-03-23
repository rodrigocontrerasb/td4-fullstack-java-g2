package com.desafio.sistemasolar;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaSolarPrueba {
	@Test
	public void prueba() {
		Luna l1 = new Luna("Luna 1", 7, 7);
		Luna l2 = new Luna("Luna 2", 5, 5);
		Planeta p = new Planeta("Tierra",10,10);
		p.setLunas(l1);
		p.setLunas(l2);
		
		// prueba si agrega bien las cantidades de lunas
		assertEquals(2,p.getLunas().size(),0);
		
		// prueba si configura bien mis clases
        assertTrue(p.getNombre()=="Tierra");
        assertTrue(p.getLunas().get(0).getNombre()=="Luna 1");
        
        // verifico si agrego correctamente las lunas
        assertTrue(p.getLunas().size()==2);
		
		
	}
}
