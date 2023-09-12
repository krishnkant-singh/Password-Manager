package com.manager.servlets;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


	@WebServlet("/RegistrationServlet")
	public class RegistrationServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    Connection connection;
	    
	    public RegistrationServlet(Connection Con) {
	    	connection=Con;
	    	
	    }
	    

//	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//	            throws ServletException, IOException {
//	        int username = request.getParameter("username");
//	        String password = request.getParameter("password");
//	        String email = request.getParameter("email");
//
//	        if (registerUser(username, password, email)) {
//	            // If registration succeeds, redirect to a success page
//	            response.sendRedirect("registration_success.jsp"); // Replace with your success page
//	        } else {
//	            // If registration fails, redirect back to the registration page with an error message
//	            response.sendRedirect("registration.jsp?registration_error=true"); // Replace with your registration page
//	        }
//	    }

	    public boolean registerUser(int user_id, String username, String email) {
	        // Replace these with your database connection details
	       

	        try  {
	            String sql = "INSERT INTO users1 (user_id, username, email) VALUES (?, ?, ?)";
	            try (PreparedStatement statement = connection.prepareStatement(sql)) {
	                statement.setInt(1, user_id);
	                statement.setString(2, username);
	                statement.setString(3, email);

	                int rowsInserted = statement.executeUpdate();
	                return rowsInserted > 0; // If one or more rows were inserted, registration is successful
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false; // Registration failed
	    }
	}


