import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Operation 
{

	public static ResultSet getDetails(Product p, Connection con) throws ClassNotFoundException, SQLException
	{
		PreparedStatement pstatement;
		ResultSet resultset;
		
		String qry = "select * from product where pid = ?";
		
		pstatement = con.prepareStatement(qry);
		pstatement.setInt(1, p.getId());
		resultset = pstatement.executeQuery();
		
		return resultset;
		
		
	}
}
