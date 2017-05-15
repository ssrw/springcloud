package ssrw.javafiles;

import org.springframework.jdbc.core.JdbcTemplate;

public class ContactDao {
	
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
    private static String divInd = "none";
    private static  String errInd = "none";
    
	public String getErrInd() {
		return errInd;
	}

	public void setErrInd(String errInd) {
		this.errInd = errInd;
	}

	public String getDivInd() {
		return divInd;
	}

	public void setDivInd(String divInd) {
		this.divInd = divInd;
	}

	public int insertToContact(String name, String email , String telephone ,String message) {
	        int i=0;
	        double sequenceVal =  Math.random();
	        String str =String.valueOf(sequenceVal);
	        String seq = str.substring(3, str.length());
	      try{
	    	  
	    	  String sql = "insert into t_contact (contact_id , contact_person_name , contact_person_email , contact_person_telephone , message_of_contactperson) values (?, ?, ?, ?, ?)";
	    	  i=template.update( sql, new Object[] {seq, name , email , telephone ,message});

	    	 
	      }
	      catch(Exception ex){
	    	  System.out.println("Error while inserting into contact table");
	      }
	      finally{
		      if(i>0){
	    		  return 1;
	    	  }else{
	    		  return 0;
	    	  }
	      }    
		      
	     
	 }
	

}
