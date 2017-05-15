import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class FirstExample {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/ex";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "password";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);
		      System.out.println("Connection Com");
		   }
		   catch(Exception ex)
		   {
			  System.out.println("Error"+ex.getMessage()); 
		   }


	}

}
