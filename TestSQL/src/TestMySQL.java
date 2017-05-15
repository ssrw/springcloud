import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestMySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ResultSet rs = null;
	      PreparedStatement pst = null;
	      Connection con = getConnection();
	      String stm = "Select * from client";
	      try {   
	         pst = con.prepareStatement(stm);
	         pst.execute();
	         rs = pst.getResultSet();

	         while(rs.next()){
	            System.out.println(rs.getString(1));
	            				
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	     
	      
	      StringBuffer sb1=new StringBuffer("Amit");
	      StringBuffer sb2=new StringBuffer("Amit");
	      String sss1="Amit";
	      System.out.println(sb1==sb2);
	      System.out.println(sb1.equals(sb2));
	      System.out.println(sb1.equals(sss1));
	      System.out.println("Podder".substring(3));
	   }

	
	
	   public static Connection getConnection(){
		      Connection con = null;

		      String url ="jdbc:mysql://localhost:3306/guesthouse";
		      String user = "root";
		      String password = "pwd";
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
