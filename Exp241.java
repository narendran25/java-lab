import java.sql.*;
public class Exp241 {
	public static void main(String[] args) 
	{

	    try
	    {

	        Connection conn=DriverManager.getConnection("jdbc:ucanaccess://‪F:\\JDBC\\Java Access connect\\Theatre1.mdb");
	        Statement stment = conn.createStatement();
	        String qry = "SELECT * FROM Hurricane";

	        ResultSet rs = stment.executeQuery(qry);
	        while(rs.next())
	        {
	            String id    = rs.getString("Seat") ;
	            String fname = rs.getString("Availablity");

	            System.out.println("Seat no="+id +"\t" +"Availablity=" +fname +"\n");
	        }
	    }
	    catch(Exception err)
	    {
	        System.out.println(err);
	    }



	}}  