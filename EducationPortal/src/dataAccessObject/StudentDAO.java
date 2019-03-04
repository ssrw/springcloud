package dataAccessObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import studentRowMappers.StaffDesignationRowmapper;
import studentRowMappers.StudentRowMapper;
import constantFiles.StudentConstant;
import beanFiles.StaffDesignation;
import beanFiles.Student;

public class StudentDAO {
	
	

	public StudentDAO() {
		System.out.println("SpringDAO has been initialised");
	}


	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	/*public List<Student> getAllStudents(){
		
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
		  } */
	
	 public int create(String name, String contactno, String email, String regno, String dept, String address, String guardianname, String guardiancntctno) {
	      String sql = "insert into t_student_reg (st_name, st_contact_no, st_email, st_reg_no, st_dept, st_addr, st_guardian_name, st_guardian_contact_no) values (?, ?, ?, ?, ?, ?, ?, ?)";
	      
	      int inserInd =template.update( sql, new Object[] {name, contactno, email, regno, dept, address, guardianname, guardiancntctno });
	      System.out.println("Created Record Name = " + name);
	      
	      return inserInd;
	     
	 }
	 
	
		 
    @SuppressWarnings("unchecked")
	public List<Student> getAllStudentsRecords(Student studentObj){  
    	 
    	 String sql = "SELECT * FROM t_student_reg WHERE st_name = ? AND st_reg_no = ?";

    	 List<Student> studentListRecord = getTemplate().query(
    				sql, new Object[] { studentObj.getName(), studentObj.getRegno()}, new StudentRowMapper());

    	 return studentListRecord;
    	     
	}  
    
    @SuppressWarnings("unchecked")
  	public ArrayList<Student> fetchAllStudentsRecords(){  
      	 
      	 String sql = "SELECT * FROM t_student_reg";

      	 List<Student> studentListRecord = getTemplate().query(
      				sql, new Object[] {}, new StudentRowMapper());

      	 ArrayList<Student> list = new ArrayList<Student>();
      	 for (Student student : studentListRecord) {
      		 list.add(student);
		 }
      	 return list;
      	     
  	} 
    
    public LinkedHashMap<String,String> getAllDesignationsForStaff(){
    	String sql = "SELECT * FROM t_staff_designation";
    	List<StaffDesignation> designationRecord = getTemplate().query(
				sql, new Object[] {}, new StaffDesignationRowmapper());
    	
    	LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
    	
    	map.put(" ", "SELECT");
    	
    	for (StaffDesignation staffDesignation : designationRecord) {
			map.put(String.valueOf(staffDesignation.getId()), staffDesignation.getDesignation_name());
		}
    	return map;
    	
    }
    
    @SuppressWarnings("unchecked")
  	public String fetchStudentStatus(Student st){  
      	 
		String sql = "SELECT * FROM t_student_reg WHERE st_name = ? AND st_reg_no = ?";

		List<Student> studentListRecord = getTemplate().query(sql,
				new Object[] { st.getName(), st.getRegno() },
				new StudentRowMapper());

		if (studentListRecord != null && studentListRecord.size() > 0) {
			return StudentConstant.ACTIIVE_STUDENT;
		} else {
			return StudentConstant.DELETED_STUDENT;
		}

  	} 
    
		 
}
