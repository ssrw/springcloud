package managebean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserValidation {
	
	public String fetchDataFromCredentilas(String name,String password){
		int flag=0;
		ResultSet rs = null;
	      PreparedStatement pst = null;
	      
		Connection con = SetUpConnevtion.setUpconnection();
	      String stm =  "select * from credentials where name = '" + name + "'";
	      try {   
	         pst = con.prepareStatement(stm);
	         pst.execute();
	         rs = pst.getResultSet();
             
	         while(rs.next()){
	            String pwd=rs.getString("password");
	            if(pwd.equals(password)){
	            	flag=1;
	            	break;
	            }
	            				
	         }
	      } 
	      catch (SQLException e) {
	         e.printStackTrace();
	      }
	      if(flag==1){
	    	  return "success";
	    	  
	      }else{
	    	  return "fail";
	      }
	     
		
	}

}
