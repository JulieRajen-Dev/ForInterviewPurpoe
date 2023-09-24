package com.login_registration.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
    private Connection con;
    private Statement stmnt;
	public DAOServiceImpl() {
		//constructor
		
	}

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_db", "root", "test");
		     stmnt=con.createStatement();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}

	}

	@Override
	public boolean verifyCredentials(String username, String password) {
	try {
		ResultSet result=stmnt.executeQuery("select * from login where email='" + username + "' and password='" + password + "'");
        //System.out.println(result.next()); 
		//System.out.println("0");
		return result.next();
		
		//if email password found it will return true not found false 
        
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		return false; //if anything else goes wrong it will return false.
	}

	@Override
	public void saveNewRegistration(String name, String city, String email, Long contact) {
		Statement stmnt;
		try {
			stmnt = con.createStatement();
			stmnt.executeUpdate("Insert into registration values('"+name+"','"+city+"','"+email+"','"+contact+"')");
		//System.out.println("1");
		} catch (SQLException e) {
			
			e.printStackTrace();
			//System.out.println("2");
		}
		
	}

}
