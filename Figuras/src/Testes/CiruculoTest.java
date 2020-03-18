package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelos.Ciruculo;

class CiruculoTest {
	Ciruculo circulo;
	@BeforeEach
	void preparacao() {
		circulo = new Ciruculo(5);
	}
	@Test
	void test_area() {
		double resultado = circulo.area();
		assertEquals(78.50,resultado);
	}
	
	@Test
	void test_perimetro() {
		double resultado = circulo.perimetro();
		assertEquals(31.40,resultado);
	}

}
