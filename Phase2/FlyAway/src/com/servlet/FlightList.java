package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.database.Dao;

@WebServlet("/FlightList")
public class FlightList extends HttpServlet
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException
	{

		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String departure = request.getParameter("departure");

		try 
		{
			Dao dao = new Dao();
			List<String[]> flights = dao.getAvailableFlights(from, to, departure);
			HttpSession session = request.getSession();
			session.setAttribute("flights", flights);
			System.out.println(flights.toString());

		}
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println(e);
		}
		response.sendRedirect("FlightList.jsp");
	}
}
