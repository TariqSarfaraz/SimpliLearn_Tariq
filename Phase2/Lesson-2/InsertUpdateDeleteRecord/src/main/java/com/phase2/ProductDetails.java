package com.phase2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Connection con = DbConnection.getCon();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Statement statement;
		ResultSet rs;
		
		try 
		{
			statement = con.createStatement();
			
			statement.executeUpdate("insert into learner values (3, 'Tariq', 'FSD')");
			out.println("<h3 align = 'center'>Record Inserted<br>");
			
			statement.executeUpdate("update learner set name = 'Shreyas' where id = 3");
			out.println("Record Updated<br>");
			
			statement.executeUpdate("delete from learner where id = 3");
			out.println("Record Deleted</h3>");
			
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
