package com.phase2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection
{
	public static Connection getCon()
	{
		Connection con = null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "Tariq@123");
		} 
		catch (SQLException | ClassNotFoundException e) 
		{
			System.out.println("Issues in Connecting : " + e);
		}
		
		return con;
	}
	
}
