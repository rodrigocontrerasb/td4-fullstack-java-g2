package com.micalculadora.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.micalculadora.Calculadora;

public class CalculadoraPrueba {

	@Test
	public void prueba() {
		assertEquals(4, Calculadora.suma(2, 2), 0);
		assertEquals(4, Calculadora.multiplica(2, 2), 0);
		assertEquals(0, Calculadora.resta(2, 2), 0);
		assertEquals(1, Calculadora.divide(2, 2), 0);
		assertEquals(0, Calculadora.resto(2, 2), 0);
	}

	@Test
	public void prueba2() {
		assertEquals(2, Calculadora.suma(2, 2), 0);
	}

}
