package com.hibernate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		SessionFactory factory = InitHibernate.getCon();
		
		out.println("<br><h1 align = 'center'> Connection Established </h1>");
		
		Session session = factory.openSession();
		out.println("<br><h4 align = 'center'> Hibernate Session Opened </h4>");
		
		session.close();
		out.println("<br><h4 align = 'center'> Hibernate Session Closed </h4>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
