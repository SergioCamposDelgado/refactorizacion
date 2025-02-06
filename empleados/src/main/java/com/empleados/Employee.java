package com.empleados;

public class Employee {
	protected Integer añosEmpresa;
	protected String nombre;
	
	public Employee (String nombre, int añosEmpresa) {
		if (añosEmpresa >= 0) {
			this.añosEmpresa = añosEmpresa;
		} else {
			this.añosEmpresa = 0;
		}
		this.nombre = nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	} 
	
	public void setAñosEmpresa (int añosEmpresa) {
		if (añosEmpresa < 0) {
			this.añosEmpresa = añosEmpresa;
		} else {
			this.añosEmpresa = 0;
		}
	} 
	
	public String getNombre () {
		return this.nombre;
	}
	
	public Integer getAñosEmpresa () {
		return this.añosEmpresa;
	}
	
	public String sumarAño() {
		añosEmpresa++;
		return "El empleado " +this.nombre +" ha cumplido " +this.añosEmpresa +" años en la empresa" ;
	}
}
