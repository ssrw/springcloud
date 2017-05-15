package org.aife.messenger;

import java.sql.Connection;
import java.sql.DriverManager;

public class SetConnection {
	
	public static Connection getConnection(){
		 Connection con = null;

	      String url ="jdbc:mysql://localhost:3306/test";
	      String user = "root";
	      String password = "password";
	      try {
	    	 Class.forName("com.mysql.jdbc.Driver").newInstance();
	         con = DriverManager.getConnection(url, user, password);
	         System.out.println("Connection completed.");
	      } catch (Exception ex) {
	         System.out.println(ex.getMessage());
	      }
	      finally{
	      }
	      return con;
	}

}
