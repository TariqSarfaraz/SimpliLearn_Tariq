package com.phase2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/ListProducts")
public class ListProducts extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		SessionFactory factory = HibernateUtil.getFactory();
		
		Session session = factory.openSession();
		
		List<Learner> list = session.createQuery("from Learner").list();
		session.close();
		
		out.println("<h2>Learner's List:<br>");
		
		for (Learner l : list)
		{
			out.println("Id: " + l.getId() + " Name: " + l.getName() + " Domain: " + l.getDomain() + "<br>");
		}
		
		out.println("</h2>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
