package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelos.Quadrado;

class QuadradoTest {
	Quadrado quadrado;
	@BeforeEach
	void preparacao() {
		quadrado = new Quadrado(6,6);
	}
	@Test
	void test_area() {
		double resultado = quadrado.area();
		assertEquals(36,resultado);
	}
	@Test
	void test_perimetro() {
		double resultado = quadrado.perimetro();
		assertEquals(24,resultado);
	}
}
