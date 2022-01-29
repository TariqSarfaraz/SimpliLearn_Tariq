
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductSearch")
public class ProductSearch extends HttpServlet
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Product p = new Product();

		p.setId(Integer.parseInt(request.getParameter("pid")));
		try 
		{
			Connection con = DbConnection.dbCon();
			ResultSet resultset = Operation.getDetails(p, con);

			
			if (resultset.next() != false) 
			{
				out.println("<h3>Product Details:</h3>\n\n");
				out.println("<table border = '1'><th>Product Id</th><th>Product Name</th>");
				
				do {
					out.println("<tr><td>" + resultset.getInt(1) + "</td><td>" + resultset.getString(2) + "</td></tr>");
				}
				while (resultset.next());
				
			}
			else
			{
				out.println("No product found with this Id.");
			}

			con.close();

		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println(e);
		}
	}

}
