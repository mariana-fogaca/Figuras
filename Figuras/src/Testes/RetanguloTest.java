package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelos.Retangulo;

class RetanguloTest {
	Retangulo retangulo;
	@BeforeEach
	void preparacao_teste() {
		retangulo = new Retangulo(6,4);
	}
	@Test
	void test_area() {
		double resultado = retangulo.area();
		assertEquals(24,resultado);
	}
	
	@Test
	void test_perimetro() {
		double resultado = retangulo.perimetro();
		assertEquals(20,resultado);
	}

}
