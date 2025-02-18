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
	
	@DisplayName("listProduct")
	@Test
	void test2() {
		String resultadoEsperado = "Grafica" + ", " + "350.0" +"€";
		String resultadoObtenido = Producto.listProducts();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@DisplayName("compareTo")
	@Test
	void test3() {
		int resultadoEsperado = ;
		int resultadoObtenido = product1.compareTo(product2);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@DisplayName("findProduct")
	@Test
	void test4() {
		
	}

}
