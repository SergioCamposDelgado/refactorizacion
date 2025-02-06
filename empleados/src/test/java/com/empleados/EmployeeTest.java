/**
 * 
 */
package com.empleados;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
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
	@Test
	void testContructorAñosNegativa() {
		Employee empleado = new Employee ("Juan" , -2);
		
		Integer resultadoEsperado = 0;
		Integer resultadoObtenido = empleado.añosEmpresa;
		
		assertEquals(resultadoEsperado, resultadoObtenido ,"los años esperados no concuerdan");
	}

}
