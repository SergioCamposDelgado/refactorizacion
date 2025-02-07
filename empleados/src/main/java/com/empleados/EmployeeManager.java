package com.empleados;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
	
	protected List<Employee> empleados = new ArrayList<Employee>();
    
    public void addEmployee(Employee empleado) {
        empleados.add(empleado);
    }
    
    @Override
    public String toString() {
    	String s = "";
        s += "List of employees:" + "\n" ;
        for (int i = 0; i < empleados.size(); i++) {
            s+= empleados.get(i).getNombre() + ", Years in company: " + empleados.get(i).getAñosEmpresa() +"\n";
        }
        return s;
    }

}
