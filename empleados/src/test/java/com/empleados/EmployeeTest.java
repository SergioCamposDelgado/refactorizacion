/**
 * 
 */
package com.empleados;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class EmployeeTest {

	Employee empleado;
	@BeforeEach
	void setUp() throws Exception {
		empleado = new Employee ("Juan" , 2);
	}
	
	
	/**	
	 * Test de constructor
	 */
	@DisplayName ("Contructor de años negativo")
	@Test
	void testContructorAñosNegativa() {
		Employee empleado = new Employee ("Juan" , -2);
		
		Integer resultadoEsperado = 0;
		Integer resultadoObtenido = empleado.añosEmpresa;
		
		assertEquals(resultadoEsperado, resultadoObtenido ,"los años esperados no concuerdan");
	}
	
	/**
	 * Test de los get
	 */
	
	@DisplayName ("metodo getAñosEmpresa")
	@Test
	void testGetAñosEmpresa() {
		
		Integer resultadoEsperado = 2;
		Integer resultadoObtenido = empleado.getAñosEmpresa();
		
		assertEquals(resultadoEsperado, resultadoObtenido ,"los resultados del getAñosEmpresa esperados no concuerdan");
	}
	
	@DisplayName ("metodo getNombre")
	@Test
	void testGetNombre() {
		
		String resultadoEsperado = "Juan";
		String resultadoObtenido = empleado.getNombre();
		
		assertEquals(resultadoEsperado, resultadoObtenido ,"los resultados del getNombre esperados no concuerdan");
	}
	
	/**
	 * Test de los set
	 */
	
	@DisplayName ("metodo setAñosEmpresa con datos validos")
	@Test
	void testSetAñosEmpresa() {
		
		empleado.setAñosEmpresa(3);
		
		Integer resultadoEsperado = 3;
		Integer resultadoObtenido = empleado.añosEmpresa;
		
		assertEquals(resultadoEsperado, resultadoObtenido ,"los resultados del setAñosEmpresa esperados no concuerdan");
	}
	
	@DisplayName ("metodo setAñosEmpresa done los años son negativo")
	@Test
	void testSetAñosEmpresaNegativos() {
		
		empleado.setAñosEmpresa(-3);
		
		Integer resultadoEsperado = 2;
		Integer resultadoObtenido = empleado.añosEmpresa;
		
		assertEquals(resultadoEsperado, resultadoObtenido ,"los resultados del setAñosEmpresa esperados no concuerdan");
	}
	
	@DisplayName ("metodo setNombre")
	@Test
	void testsetNombre() {
		
		empleado.setNombre("Ana");
		
		String resultadoEsperado = "Ana";
		String resultadoObtenido = empleado.nombre;
		
		assertEquals(resultadoEsperado, resultadoObtenido ,"los resultados del setNombre esperados no concuerdan");
	}
	
	/**
	 * Pruebas del metodo sumarAño
	 */
	
	@DisplayName ("metodo setAñosEmpresa con datos validos")
	@Test
	void testSumarAño_años() {
		
		empleado.sumarAño();
		
		Integer resultadoEsperado = 3;
		Integer resultadoObtenido = empleado.añosEmpresa;
		
		assertEquals(resultadoEsperado, resultadoObtenido ,"los resultados del setAñosEmpresa esperados no concuerdan");
	}
	
	@DisplayName ("metodo setAñosEmpresa done los años son negativo")
	@Test
	void testSumarAño_mensaje() {
		
		String resultadoEsperado = "El empleado Juan ha cumplido 3 años en la empresa";
		String resultadoObtenido = empleado.sumarAño();
		
		System.out.print(resultadoObtenido);
		
		assertEquals(resultadoEsperado, resultadoObtenido ,"los resultados del setAñosEmpresa esperados no concuerdan");
	}
	
}
