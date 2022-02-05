package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("name", username);
		session.setAttribute("password", password);
		
		
		if ( username != null && password != null )
		{
			response.sendRedirect("Dashboard");
		}
		else
		{
			response.getWriter().println("<SPAN align = 'center'> Invalid username or password </SPAN>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
		}
	}

}
