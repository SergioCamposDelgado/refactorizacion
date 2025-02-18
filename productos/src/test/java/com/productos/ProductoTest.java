package com.productos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductoTest {
	Producto product1;
	Producto product2;
	@BeforeEach
	void setUp() throws Exception {
		product1 = new Producto("Grafica", 350.0);
		product2 = new Producto("Procesador", 90.0);
	}
	
	@DisplayName("ToString")
	@Test
	void test1() {
		String resultadoEsperado = "Grafica" + ", " + "350.0" +"€";
		String resultadoObtenido = product1.toString();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	@DisplayName("compareTo")
	@Test
	void test2() {
		int resultadoEsperado = product1.getName().compareTo(product2.getName());
		int resultadoObtenido = product1.compareTo(product2);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	

}
