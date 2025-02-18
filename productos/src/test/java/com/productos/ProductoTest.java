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
	void testImprimirProducto() {
		String resultadoEsperado = "Grafica" + ", " + "350.0" +"€";
		String resultadoObtenido = product1.toString();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	@DisplayName("compareTo")
	@Test
	void testCompararProducto() {
		int resultadoEsperado = product1.getName().compareTo(product2.getName());
		int resultadoObtenido = product1.compareTo(product2);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	@DisplayName("getName")
	@Test
	void testGetName() {
		String resultadoEsperado = "Procesador";
		String resultadoObtenido = product2.getName();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	@DisplayName("setName")
	@Test
	void testSetName() {
		product1.setName("Grafica");
		String resultadoEsperado = "Grafica";
		String resultadoObtenido = product1.name;
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	@DisplayName("getPrice")
	@Test
	void testGetPrice() {
		double resultadoEsperado = 350.0;
		double resultadoObtenido = product1.getPrice();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	@DisplayName("setPrice")
	@Test
	void testSetPrice() {
		product2.setPrice(90.0);
		double resultadoEsperado = 90.0;
		double resultadoObtenido = product2.price;
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}
