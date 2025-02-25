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
		
		Exception exception_name2 = assertThrows(IllegalArgumentException.class, ()->new Product(" ", 3.20) );
		String mensajeEsperado_name2 = "Error: Nombre inválido";
		
		Exception exception_price = assertThrows(IllegalArgumentException.class, ()->new Product("Laptop", -3.20) );
		String mensajeEsperado_price = "Error: Precio negativo";
		
		assertEquals(mensajeEsperado_price, exception_price.getMessage());
		
		assertEquals(mensajeEsperado_name, exception_name.getMessage());
		
		assertEquals(mensajeEsperado_name2, exception_name2.getMessage());
		
	}
	
	@Test
	@DisplayName ("Debe lanzar ser valido si el toString funciona")
	void testToString() {
		
		String mensajeObtenido = product.toString();
		String mensajeEsperado = "Product [name=" + product.getName() + ", price=" + product.getPrice() + "]";
		
		assertEquals(mensajeEsperado, mensajeObtenido);
			
	}
	
	@Test
	@DisplayName ("Debe ser valido el SetPrice() con precio valido")
	void testSetPrice() {
		
		product.setPrice(20.00);
		double precioObtenido = product.getPrice();
		double precioEsperado = 20.00;
		
		assertEquals(precioObtenido, precioEsperado);
			
	}
	
	@Test
	@DisplayName ("Debe crear un excepcion de precio invalido")
	void testSetPriceExcepcion() {
		double precioEsperado = 1200.00;

		Exception exception_price = assertThrows(IllegalArgumentException.class, ()->product.setPrice(-20.00) );
		String mensajeEsperado_price = "Error: Precio negativo";
		
		double precioObtenido = product.getPrice();
		
		assertEquals(precioObtenido, precioEsperado);
		assertEquals(mensajeEsperado_price, exception_price.getMessage());
			
	}
	
	@Test
	@DisplayName ("Debe ser valido el SetName() con nombre valido")
	void testSetName() {
		
		product.setName("PC");
		String mensajeObtenido = product.getName();
		String mensajeEsperado = "PC";
		
		assertEquals(mensajeEsperado, mensajeObtenido);
			
	}
	
	@Test
	@DisplayName ("Debe crear un excepcion de nombre invalido")
	void testSetNameExcepcion() {
		
		String mensajeEsperado = "Laptop";
		

		Exception exception_name = assertThrows(IllegalArgumentException.class, ()->product.setName(null) );
		String mensajeEsperado_exception = "Error: Nombre inválido";
		
		Exception exception_name2 = assertThrows(IllegalArgumentException.class, ()->product.setName(" ") );
		String mensajeEsperado_exception2 = "Error: Nombre inválido";
		
		String mensajeObtenido = product.getName();
		
		assertEquals(mensajeObtenido, mensajeEsperado);
		assertEquals(mensajeEsperado_exception, exception_name.getMessage());
		assertEquals(mensajeEsperado_exception2, exception_name2.getMessage());
		
			
	}
	
	@Test
	@DisplayName ("Debe ser valido el Constructor vacio ()")
	void testConstructorVacio() {
		
		Product p = new Product();
		
		assertNotNull(p);
			
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
