package com.productos.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class DatabaseConnection {

	protected static String URL = "jdbc:sqlite:/home/grecoxyt/Escritorio/Instituto/Entorno/refactorizacion/bbdd";
	protected static Connection connection = null;

	public DatabaseConnection() {
	}

	public static Connection getConnection() {

		if (connection == null) {
			try {
				Class.forName("org.sqlite.JDBC");
				connection = DriverManager.getConnection(URL);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

		}

		return connection;
	}
	
	public static void closeConnection () {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			}
			catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
}
