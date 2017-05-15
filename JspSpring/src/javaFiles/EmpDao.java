package javaFiles;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmpDao {
	
	
private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	public List<Student> getAllStudents(){
		
		return   getTemplate().query("select * from student",new ResultSetExtractor<List<Student>>(){ 
		    @Override  
		     public List<Student> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<Student> list=new ArrayList<Student>();  
		        while(rs.next()){  
		         Student e=new Student();    
		         e.setName(rs.getString(1));  
		         e.setRoll(rs.getString(2));  
		         list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
		  } 
	
	 public void create(String name, String roll) {
	      String sql = "insert into student(name , roll) values (?, ?)";
	      
	      template.update( sql, new Object[] {name, roll });
	      System.out.println("Created Record Name = " + name + " roll = " + roll);
	     
	 }
	 
	

}
