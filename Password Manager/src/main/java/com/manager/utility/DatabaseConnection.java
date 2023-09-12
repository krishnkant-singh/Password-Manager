package com.manager.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	// JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Password_manager";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Register the JDBC driver (optional for newer JDBC drivers)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the database
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle any SQL errors
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // Handle class not found errors
        }
        return connection;

}
}
