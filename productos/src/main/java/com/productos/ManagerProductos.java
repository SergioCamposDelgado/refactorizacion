package com.productos;

import java.util.ArrayList;
import java.util.List;

import com.productos.service.ManagerProductosInterface;

public class ManagerProductos implements ManagerProductosInterface{
	
	protected List<Producto> productos = new ArrayList<Producto>();//Crea la lista "productos"
	
	
	/**
	 * Encuentra un producto a traves del nombre
	 * @param searchName: Es una cadena de texto que almacena el nombre que se quiere buscar
	 * @return s: devuelve el indice del nombre que se esta buscando
	 */
	@Override
	public int findProducto(String searchName) {
		int s = -1;
		for ( int i = productos.size()-1; i >=0; i-- ) {
			if (productos.get(i).getName()==searchName) {
				s=i;
			}
		}
		return s;
	}

	/**
	 * Muestra la lista completa
	 * @return s: cadena de texto que almacena el producto y lo devuelve
	 */
	@Override
	public String listProducto() {
		String s = "";
		for ( int i = 0; i < productos.size(); i++ ) {
			s+=productos.get(i).toString()+"\n";
		}
		return s;
	}
	
	/**
	 * Añade el producto a la lista
	 * @param p: producto a añadir
	 */
	@Override
	public void addProducto(Producto p) {
	productos.add(p);
	}
	
}
