package com.productos.service;

import com.productos.Producto;

public interface ManagerProductosInterface {
	public int findProducto(String searchName);
	public String listProducto();
	public void addProducto(Producto p);
	public void crearTabla();
}
