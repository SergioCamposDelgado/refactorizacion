package com.productos;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;
import com.productos.dao.ProductoDAO;
import com.productos.service.ManagerProductosInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    // Método main que mezcla la lógica de negocio con la presentación
    public static void main(String[] args) {
    	ManagerProductosInterface gestor = new ManagerProductos();
    	gestor.crearTabla();
    }
    
    public static void managerProducto() {
        try {
    	ManagerProductosInterface producto = new ManagerProductos();
    	producto.addProducto(new Producto("Monitor", 250.00));
    	producto.addProducto(new Producto("Teclado", 50.00)); 
        producto.addProducto(new Producto("Mouse", 25.00)); 
        producto.addProducto(new Producto("Impresora", 150.00)); 
        System.out.println(producto.listProducto());
        System.out.println(producto.findProducto("Teclado"));
        System.out.println(producto.findProducto("Scanner")); // Producto inexistente para provocar error
		Faker faker = new Faker();
		for(int i=0; i<100; i++) {
			producto.addProducto(new Producto(faker.commerce().productName(),(double) (faker.number().numberBetween(3, 199))));
		}
		System.out.println(producto.listProducto());
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}
