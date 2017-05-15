import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {

   private static final long serialVersionUID = 1L;
   
   String clientname;
 	String id;
 	 private String data;
 	public String val;
 	 
 	 
 	 public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}

	public List<DataFetch> dropdownList;
 	 
 	 
 	public List<DataFetch> getDropdownList() {
		return dropdownList;
	}
	public void setDropdownList(List<DataFetch> dropdownList) {
		this.dropdownList = dropdownList;
	}
	public void execData(ComponentSystemEvent event){
 		
		String str=(String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
		System.out.println(str);
		List<DataFetch> ob1=this.fetchdata();
		
		for(int i=0;i<ob1.size();i++){
		   System.out.println(ob1.get(i).getClientname());
		   System.out.println(ob1.get(i).getClientid());
		   System.out.println();
		   System.out.println();
		   //this.setDropdownList(ob);
		}
		this.setDropdownList(ob1);
 		
 	}
 	public List<DataFetch> fetchdata(){
 		 List<DataFetch> ob=new ArrayList<DataFetch>();
 		 ResultSet rs = null;
	      PreparedStatement pst = null;
	      Connection con = getConnection();
	      String stm = "Select * from client";
	      try {   
	         pst = con.prepareStatement(stm);
	         pst.execute();
	         rs = pst.getResultSet();
	         while(rs.next()){
	        	
	            String clientname=rs.getString(1);
	            String clientid=rs.getString(2);
	           ob.add(new DataFetch(clientname,clientid));
	           /*  ob.setClientname(clientname);
	            ob.setClientid(clientid);*/
	         }
	        // return ob;
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	   
	      return (List<DataFetch>)ob;
 		
 	}
 	 
 	   Author auth=new Author();
 	   public void handleEvent(ComponentSystemEvent event){
 	      data=auth.getValdisplay();
 	   
 	    
 	   }

 	   public String getData() {
 	      return data;
 	   }

 	   public void setData(String data) {
 	      this.data = data;
 	   }
 	
 	
 	public String getId() {
 		return id;
 	}
 	public void setId(String id) {
 		this.id = id;
 	}
 	public String getClientname() {
 		return clientname;
 	}
 	public void setClientname(String clientname) {
 		this.clientname = clientname;
 	}

    public String add(){
	   
      // Author author=new Author();
       int i = 0;
	   PreparedStatement ps = null;
	   Connection con = getConnection(); 
	   try
	   {
	 
	   String sql = "INSERT INTO client(name,id) VALUES(?,?)";
	   ps= con.prepareStatement(sql); 
	   ps.setString(1,clientname);
	   ps.setString(2,id);
	   i = ps.executeUpdate();
	
	   }
	   catch(Exception e){
		System.out.println(e.getMessage());   
	   }
	   finally{
		   try{
			   con.close();
			   ps.close();
		   }
		   catch(Exception e){
			  System.out.println(e.getMessage()); 
		   }
	    if(i>0){
		   return "Home";
	    }else{
		   return "invalid";
	    }
	   }
   
   }

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