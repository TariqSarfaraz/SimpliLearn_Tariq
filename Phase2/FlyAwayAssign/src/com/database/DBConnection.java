package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	Connection conn;
	
	public DBConnection() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "Tariq@123");
		} 
		catch (SQLException e)
		{
			System.out.println(e);
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}
	
	public Connection getConnection() 
	{
		return this.conn;
	}
	
	public void closeConnection() 
	{
		try 
		{
			this.conn.close();
		} 
		catch (SQLException e) 
		{
			System.err.println(e);
		}
	}
}