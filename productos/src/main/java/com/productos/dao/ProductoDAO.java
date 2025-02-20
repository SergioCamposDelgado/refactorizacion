package com.productos.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.productos.bbdd.DatabaseConnection;

public class ProductoDAO {
	
	/**
	 * Crea la clase ProductoDAO
	 */
	ProductoDAO () {
		
	}
	
	/**
	 * Crea la tabla productos
	 * @throws ClassNotFoundException
	 */
	public static void crearTabla () throws ClassNotFoundException  {
		String sql = "CREATE TABLE IF NOT EXISTS productos (id INTEGER PRIMARY KEY, name TEXT NOT NULL, price TEXT NOT NULL)";
		try {
			Connection conn = DatabaseConnection.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(sql);
			}	catch (SQLException e) {
			System.out.println(e.toString());
		}
	}
	
	
}
