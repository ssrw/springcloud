import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

 

public class EmpDAO {
	
	
	
	
	private JdbcTemplate template;


	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	  /* private DataSource dataSource;
	   private SimpleJdbcCall jdbcCall;

	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcCall =  new SimpleJdbcCall(dataSource).
	                       withProcedureName("getStudentDet");
	   }
	
	public Student getStudent(String id){
    	SqlParameterSource in = new MapSqlParameterSource()
        .addValue("in_id", id); 
		Map<String,Object> out = jdbcCall.execute(in);
		Student stu = new Student();
		stu.setName((String)out.get("out_name"));
		stu.setRoll(id);
		return stu;
    }
*/




	public List<Student> getAllStudents(){
		String FETCH_STUDENT_RECORD="FETCH_STUDENT_RECORD";
		PropertiesHandler ob = new PropertiesHandler();
		String query=ob.keyString(FETCH_STUDENT_RECORD);
		
		return   getTemplate().query(query,new ResultSetExtractor<List<Student>>(){ 
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
	
	
	public List<Student> getAllstudentsRowMapper(){  
		 return template.query("select * from STUDENT",new RowMapper<Student>(){  
		    @Override  
		    public Student mapRow(ResultSet rs, int rownumber) throws SQLException {  
		    	Student e=new Student();  
		    	e.setName(rs.getString(1));  
		        e.setRoll(rs.getString(2)); 
		        return e;  
		    }  
		    });  
	}
	
	 public void create(String name, String roll) {
	      String sql = "insert into student(name , roll) values (?, ?)";
	      
	      template.update( sql, new Object[] {name, roll });
	      System.out.println("Created Record Name = " + name + " roll = " + roll);
	     
	 }
	 
	 public void update(){}
	 
	
	
}
