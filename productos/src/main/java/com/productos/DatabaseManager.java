package com.productos;

import java.sql.*;

public class DatabaseManager {
    private static final String URL = "jdbc:sqlite:/home/grecoxyt/Escritorio/Instituto/Entorno/proyecto_empleados_solo/refactorizacion/productos.db";

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS productos (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     "nombre TEXT NOT NULL, " +
                     "precio REAL NOT NULL)";

        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) { createTable(); }
}