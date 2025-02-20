package com.productos;

import java.util.ArrayList;
import java.util.List;

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
    	managerProducto();
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
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}
