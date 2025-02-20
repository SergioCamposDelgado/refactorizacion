package com.productos.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.productos.bbdd.DatabaseConnection;

public class ProductoDAO {
	
	
	ProductoDAO () {
		
	}
	
	public void CrearTabla ()  {
		String sql = "CREATE TABLE IF NOT EXIST productos (id INTEGER PRIMARY KEY, name TEXT NOT NULL, price TEXT NOT NULL)";
		try {
			Connection conn = DatabaseConnection.getConnection();
			Statement statement = conn.createStatement();
			
			}	catch (SQLException e) {
			System.out.println(e.toString());
		}
	}
	
	
}
