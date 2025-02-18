package com.productos;

import java.util.ArrayList;
import java.util.List;

import com.productos.service.ManagerProductosInterface;

public class ManagerProductos implements ManagerProductosInterface{

	protected List<Producto> productos = new ArrayList<Producto>();
	
	
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

	@Override
	public String listProducto() {
		String s = "";
		for ( int i = 0; i < productos.size(); i++ ) {
			s+=productos.get(i).toString()+"\n";
		}
		return s;
	}

	@Override
	public void addProducto(Producto p) {
	productos.add(p);
	}
	
}
