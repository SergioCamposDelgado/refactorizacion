package com.productos.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	protected static String URL = "jdbc:sqlite:/home/grecoxyt/Escritorio/Instituto/Entorno/refactorizacion/bbdd";
	protected static Connection connection;

	public DatabaseConnection() {
	
	}

	
	/**
	 * Realiza la conexión a la base de datos
	 * 
	 * @return conexión a al base de datos
	 * @throws ClassNotFoundException
	 */
	public static Connection getConnection() throws ClassNotFoundException {

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
	
	
	/**
	 * Realiza la desconexión
	 */
	public static void closeConnection () {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
}
