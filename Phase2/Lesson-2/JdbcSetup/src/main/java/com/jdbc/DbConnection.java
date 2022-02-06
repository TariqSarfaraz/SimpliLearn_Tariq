package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection 
{
	Connection con = null;

	public Connection getCon()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "Tariq@123");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println("Issues in connecting : " + e);
		}
		
		
		return con;
	}
}
