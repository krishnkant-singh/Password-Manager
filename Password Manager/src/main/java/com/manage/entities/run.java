package com.manage.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.manager.servlets.RegistrationServlet;

public class run {
	public static void main(String [] args) {
		
		
		try {		
		Class.forName("com.mysql.cj.jdbc.Driver");  
		
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/Password_manager","root","root");
			RegistrationServlet re= new  RegistrationServlet(con);
			System.out.print( re.registerUser(5, "efml", "pessrerword"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		//here sonoo is database name, root is username and password 
		
	
	
		
		
	}

}
