package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ProductTest {

	protected Product product;
	
	@BeforeEach
	void setUp() throws Exception {
		product = new Product("Laptop" , 1200.00);
	}

	@Test
	@DisplayName ("Debe crear un producto con nombre y precio valido")
	void deberiaCrearUnProductValido() {
		
		String nameEsperado = "Laptop";
		
		double priceEsperado = 1200.00;
		
		assertNotNull(product);
		
		assertEquals(nameEsperado, product.getName());
		
		assertEquals(priceEsperado, product.getPrice());
	}

	
	@Test
	@DisplayName ("Debe lanzar IllegalArgumentExcaption si el nombre es nulo o vacio")
	void deberiaCrearUnaExcepcion() {
		
		Exception exception_name = assertThrows(IllegalArgumentException.class, ()->new Product(null, 3.20) );
		String mensajeEsperado_name = "Error: Nombre inválido";
		
		Exception exception_price = assertThrows(IllegalArgumentException.class, ()->new Product("Laptop", -3.20) );
		String mensajeEsperado_price = "Error: Precio negativo";
		
		assertEquals(mensajeEsperado_price, exception_price.getMessage());
		assertEquals(mensajeEsperado_name, exception_name.getMessage());
		
	}
	
	@ParameterizedTest
	@CsvSource({"'Smartphone' , 699,99" , "'Tablet' , 229,40" ,"'Monitor' , 100.00" })
	@DisplayName ("Debe crear permitir crear productos con nombre y precio validos")
	void deberiaCrearProductoConVariosAtributosValidos (String name , double price) {
		Product p = new Product(name, price);
		assertNotNull(p);
		assertEquals(name, p.getName());
		assertEquals(price, p.getPrice());
	}
}
