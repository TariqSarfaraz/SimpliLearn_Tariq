

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		if(session.getAttribute("username") != null)
		{
		out.println("<h1 align = 'center'> Welcome " + session.getAttribute("username"));
		out.println("<br></h1>");
		out.println("<h4 align = 'center'><a href = 'Logout'> LOGOUT </a></h4>");
		}
		else
		{
			response.sendRedirect("index.html");
		}
		
	}

}
