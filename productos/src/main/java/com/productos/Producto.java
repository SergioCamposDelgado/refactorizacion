package com.productos;

public class Producto implements Comparable<Producto>{

	
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