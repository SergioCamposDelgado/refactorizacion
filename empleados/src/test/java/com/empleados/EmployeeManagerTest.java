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
class EmployeeManagerTest {

	EmployeeManager empleados;
	@BeforeEach
	void setUp() throws Exception {
		empleados = new EmployeeManager();
		empleados.addEmployee(new Employee ("Juan" , 2));
	}
	
	
	/**	
	 * Test del metodo add
	 */
	@DisplayName ("Añadir empleado")
	@Test
	void testAddEmployee() {
		Employee resultadoEsperado = new Employee ("Juan" , 2);
		EmployeeManager empleados = new EmployeeManager();
		empleados.addEmployee(resultadoEsperado);
		Employee resultadoObtenido = empleados.empleados.get(0);
		
		assertEquals(resultadoEsperado, resultadoObtenido ,"los empleados no concuerdan");
	}
	
	/**	
	 * Test del metodo add
	 */
	@DisplayName ("Añadir empleado")
	@Test
	void testToString() {
		String resultadoEsperado = "List of employees:" + "\n" + empleados.empleados.get(0).getNombre() + ", Years in company: " + empleados.empleados.get(0).getAñosEmpresa() +"\n";
		String resultadoObtenido = empleados.toString();
		
		assertEquals(resultadoEsperado, resultadoObtenido ,"los empleados no concuerdan");
	}
	
}
