package com.productos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductoTest {
	Producto product;
	
	@BeforeEach
	void setUp() throws Exception {
		product = new Producto("Grafica", 350.0);
	}
	@DisplayName("ToString")
	@Test
	void test1() {
		
	}
	
	@DisplayName("listProduct")
	@Test
	void test2() {
		
	}
	
	@DisplayName("compareTo")
	@Test
	void test3() {
		
	}

}
