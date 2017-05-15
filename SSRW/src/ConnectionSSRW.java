import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionSSRW {

	public Connection getConnection(){
	      Connection con = null;

	      String url ="jdbc:mysql://localhost:3306/guesthouse";
	      String user = "root";
	      String password = "pwd";
	      try {
	    	 Class.forName("com.mysql.jdbc.Driver").newInstance();
	         con = DriverManager.getConnection(url, user, password);
	      } catch (Exception ex) {
	         System.out.println(ex.getMessage());
	      }
	      finally{
	      }
	      return con;
	   }
}
