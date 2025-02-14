package com.productos;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    // Método main que mezcla la lógica de negocio con la presentación
    public static void main(String[] args) {
        List<Producto> sp = new ArrayList();
    	Producto monitor = new Producto("Monitor", 250.00);
    	Producto teclado = new Producto("Teclado", 50.00);
        Producto mouse = new Producto("Mouse", 25.00);
        Producto impresora = new Producto("Impresora", 150.00);
        Producto.listProducts();
        Producto.findProduct("Teclado");
        Producto.findProduct("Scanner"); // Producto inexistente para provocar error
    }
}
