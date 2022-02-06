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

@WebServlet("/Servlet")
public class Servlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");;
		PrintWriter out = response.getWriter();
		Statement statement;
		ResultSet rs;
		
		Connection con = DbConnection.getCon();
		
		try 
		{
			statement = con.createStatement();
			String qry = "select * from learner";
			
			rs = statement.executeQuery(qry);
			
			out.println("<h4> Learner Details : </h4>");
			out.println("<table border = '1'> <tr><th>Id</th><th>Name</th><th>Domain</th></tr>");
			while (rs.next())
			{
				out.println("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td></tr>");
			}
			out.println("</table>");
			con.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
