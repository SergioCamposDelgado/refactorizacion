package com.productos;

public class Producto implements Comparable<Producto>{

	
	protected String name;
	protected Double price;
    
	/**
	 * 
	 * @param name: name es una cadena de texto con el nombre del producto informatico.
	 * @param price: price es un numero que puede ser decimal o no y es el precio del producto.
	 * @throws Exception: esta excepcion devuelve si el nombre y/o el precio es valido o no.
	 */
    public Producto (String name, Double price) throws Exception{
    	if (name == null || name.trim().isEmpty()) {
    		throw new Exception("nombre no valido");
    	} else if (price == null || price < 0) {
    		throw new Exception("precio no valido");
    	} else {
    		this.name = name;
    		this.price = price;
    	}
    }
    
    @Override
    public String toString()  {
    	return name + ", " + price +"€";
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
    
}