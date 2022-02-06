package com.phase2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DbOperation")

public class DbOperation extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Connection con = DbConnection.getCon();
		Statement statement;
		
		try 
		{
			statement = con.createStatement();
			
			statement.executeUpdate("create database sample");
			out.println("<h3 align = 'center'>new sample database Created<br>");
			
			statement.executeUpdate("use sample");
			out.println("sample database in use<br>");
			
			statement.executeUpdate("drop database sample");
			out.println("sample database deleted</h3>");
			
			con.close();
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
