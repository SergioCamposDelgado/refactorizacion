package com.productos;

/**
 * Hello world!
 *
 */
public class App 
{
    // Método main que mezcla la lógica de negocio con la presentación
    public static void main(String[] args) {
        Producto sp = new Producto();
        sp.addProduct("Monitor", 250);
        sp.addProduct("Teclado", 50);
        sp.addProduct("Mouse", 25);
        sp.addProduct("Impresora", 150); // Debería activar la conversión de arrays a listas
        sp.listProducts();
        sp.findProduct("Teclado");
        sp.findProduct("Scanner"); // Producto inexistente para provocar error
    }
}
