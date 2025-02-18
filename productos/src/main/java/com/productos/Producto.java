package com.productos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Producto implements Comparable<Producto>{

	// Los productos se alamcenan en listas de producos
	private static Set<Producto> Productos = new HashSet();
	
	private String name;
	private Double price;
    
    public Producto (String name, Double price) throws Exception{
    	if (name == null || name.trim().isEmpty()) {
    		throw new Exception("nombre no valido");
    	} else if (price == null || price < 0) {
    		throw new Exception("precio no valido");
    	} else {
    		this.name = name;
    		this.price = price;
    		Productos.add(this);
    	}
    }
	
	// Agrega un producto, pero con manejo de errores disperso y lógica mezclada
    
	/*public void addProduct(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Nombre inválido");
            return;
        }
        if (price < 0) {
            System.out.println("Error: Precio negativo");
            return;
        }
        try {
            if (productCount < productNames.length) {
                productNames[productCount] = name;
                productPrices[productCount] = price;
                productCount++;
                System.out.println("Producto agregado: " + name);
            } else {
                // Conversión improvisada de arrays a listas
                System.out.println("Límite de array alcanzado. Convirtiendo a lista...");
                java.util.List namesList = new java.util.ArrayList<>();
                java.util.List pricesList = new java.util.ArrayList<>();
                for (int i = 0; i < productCount; i++) {
                    namesList.add(productNames[i]);
                    pricesList.add(productPrices[i]);
                }
                namesList.add(name);
                pricesList.add(price);
                // Reconstruye los arrays a partir de la lista
                productNames = new String[namesList.size()];
                productPrices = new double[pricesList.size()];
                for (int i = 0; i < namesList.size(); i++) {
                    productNames[i] = namesList.get(i);
                    productPrices[i] = pricesList.get(i);
                }
                productCount = namesList.size();
                System.out.println("Producto agregado después de conversión: " + name);
            }
        } catch (Exception e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }
    }*/
    
    @Override
    public String toString()  {
    	return name + ", " + price +"€";
    }
    
    public static String listProducts () {
    	return Productos.toString();
    }

	@Override
	public int compareTo(Producto o) {
		return this.name.compareTo(o.name);
	}
    
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
    /*
    // Lista todos los productos. Si no hay productos, lanza una excepción de forma ineficiente.
    public void listProducts() {        try {
            if (productCount == 0) {
                throw new Exception("No hay productos para listar.");
            }
            for (int i = 0; i < productCount; i++) {
                System.out.println("Producto " + (i + 1) + ": " + productNames[i] + " - Precio: " + productPrices[i]);
            }
        } catch (ExTecladoception e) {
            System.out.println("Error en listProducts: " + e.getMessage());
        }
    } */
	
    
    
    /*
    // Busca un producto por nombre. La búsqueda y manejo de errores están mezclados.
    public void findProduct(String searchName) {
        boolean found = false;
        for (int i = 0; i < productCount; i++) {
            if (productNames[i].equalsIgnoreCase(searchName)) {
                System.out.println("Producto encontrado: " + productNames[i] + " - Precio: " + productPrices[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            try {
                throw new Exception("Producto no encontrado: " + searchName);
            } catch (Exception e) {
                System.out.println("Error en findProduct: " + e.getMessage());
            }uctNames = new String[3];
            double[] productPrices = new double[3];
            int productCount;
        }
    } */

    

}