package com.empleados;

public class App 
{
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(new Employee("John Doe", 5));
        manager.addEmployee(new Employee("Jane Smith", 2));
        System.out.print(manager);
    }
}
