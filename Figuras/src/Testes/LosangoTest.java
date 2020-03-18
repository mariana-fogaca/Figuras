package Testes;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelos.Losango;

class LosangoTest {
	Losango losango;
	
	@BeforeEach
	void preparacao() {
		losango = new Losango(8,5);
	}
	
	@Test
	void test_area() {
		double resultado = losango.area();
		assertEquals(40,resultado);
	}

	@Test
	void test_perimetro() {
		double resultado = losango.perimetro();
		assertEquals(26,resultado);
	}

}
