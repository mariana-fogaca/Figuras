package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelos.Triangulo;

class TrianguloTest {
	Triangulo triangulo;
	@BeforeEach
	void preparacaoTeste() {
		triangulo = new Triangulo(2,2);
	}
	@Test
	void test_area() {
		double resultado = triangulo.area();
		assertEquals(2,resultado);
	}
	
	@Test
	void test_perimetro() {
		double resultado = triangulo.perimetro();
		assertEquals(10,resultado);
	}
}
