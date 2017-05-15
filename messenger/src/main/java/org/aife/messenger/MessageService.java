package org.aife.messenger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import Exception.DataNotFoundException;
import Exception.DataNotFoundExceptionEntity;

public class MessageService {
	HashMap<Long,Message> mess = new HashMap<Long,Message>();
	
	
	public MessageService(){
		mess.put(3L,new Message(3L,"rihan"));
	}

    
	
	public void addMessage(Long id,String name){
		mess.put(id, new Message(id,name));
	}
	
	public Message retMessage(Long id){
		return mess.get(id);
	}
	
	public Message fetchData(Long id){
		String strid=String.valueOf(id);
		Message msg=new Message();
		ResultSet rs = null;
	      PreparedStatement pst = null;
	      try { 
	    	  
	      Connection con = SetConnection.getConnection();
	      String qry="select * from message where id='"+id+"'";
		  pst=con.prepareStatement(qry);
		  rs=pst.executeQuery();
		  	while(rs.next()){
	            msg.setId(rs.getLong(1));
	            msg.setName(rs.getString(2));
	            				
		  	}
	      } 
	      catch (SQLException e) {
	         e.printStackTrace();
	      }
	      return msg;
	}
	
	public Message insertMessage(Long id, String name){
		String strId = String.valueOf(id);
		ResultSet rs = null;
		PreparedStatement stmt = null;
		Message msg =new Message();
		int i=0;
		try {
			Connection con = SetConnection.getConnection();
			String qry = "insert into message(id ,name) values('"+strId+"','"+name+"')";
			stmt = con.prepareStatement(qry);
		    i = stmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(i>0){
			msg.setId(id);
			msg.setName(name);
			msg.setInsertStatus("Insertion was successful");
			return msg;
		}else{
			msg.setId(null);
			msg.setName(null);
			msg.setInsertStatus("Insertion was not successful");
			return msg;
		}
		
	}
	public List<Message> fetchAllIds(String name){
		
		List<Message> ob =new ArrayList<Message>();
		Message msg=null;
		ResultSet rs = null;
	      PreparedStatement pst = null;
	      try { 
	    	  
	      Connection con = SetConnection.getConnection();
	      String qry="select * from message where name='"+name+"'";
		  pst=con.prepareStatement(qry);
		  rs=pst.executeQuery();
		  	while(rs.next()){
		  		msg=new Message();
	            msg.setId(rs.getLong(1));
	            msg.setName(rs.getString(2));
	            ob.add(msg);
	            				
		  	}
	      } 
	      catch (SQLException e) {
	         e.printStackTrace();
	      }
	      
	      if(ob.size() == 0 || ob ==null){
	    	  DataNotFoundExceptionEntity ent = new DataNotFoundExceptionEntity("No data is found for this request "+name, "http://www.google.com");
	  		  Response res= Response.status(600).entity(ent).build();
			  throw new WebApplicationException(res);
		  }
	      return ob;
		
		
	}
	
}
