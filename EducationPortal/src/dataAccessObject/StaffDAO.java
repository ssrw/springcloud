package dataAccessObject;

import java.util.HashMap;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.jdbc.log.Log4JLogger;

import resultSetExtractors.StaffInformationResultSetExtractor;
import studentRowMappers.StaffDesignationRowmapper;
import studentRowMappers.StudentRowMapper;
import beanFiles.Staff;
import beanFiles.StaffDesignation;
import beanFiles.Student;

public class StaffDAO {
	
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
	
	 public int create(String staff_name, String staff_contactno, String staff_email, String staff_reg_no, String staff_designation, String staff_addr, String guardian_name, String guardian_contactno, String staff_activation_status) {
	      String sql = "insert into t_staff_reg (staff_name, staff_contactno, staff_email, staff_reg_no, staff_designation, staff_addr, guardian_name, guardian_contactno, staff_activation_status)  values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	      
	      int inserInd =template.update( sql, new Object[] {staff_name, staff_contactno, staff_email, staff_reg_no, staff_designation, staff_addr, guardian_name, guardian_contactno, staff_activation_status });
	      System.out.println("Created Record Name = " + staff_name);
	      return inserInd;
	     
	 }
	 
	
		 
    @SuppressWarnings("unchecked")
	public List<Staff> getAllStaffsRecords(Staff staffObj){  
    	 
    	 String sql = "SELECT * FROM t_staff_reg WHERE staff_email = ? AND staff_reg_no = ?";

    	 List<Staff> staffListRecord = getTemplate().query(
    				sql, new Object[] { staffObj.getEmail(), staffObj.getRegno()}, new StaffInformationResultSetExtractor());
    	 return staffListRecord;
    	     
	}  
    
 
    public HashMap<Integer,String> getAllDesignationsForStaff(){
    	String sql = "SELECT * FROM t_staff_designation";
    	List<StaffDesignation> designationRecord = getTemplate().query(
				sql, new Object[] {}, new StaffDesignationRowmapper());
    	
    	HashMap<Integer,String> map = new HashMap<Integer,String>();
    	
    	for (StaffDesignation staffDesignation : designationRecord) {
			map.put(staffDesignation.getId(), staffDesignation.getDesignation_name());
		}
    	return map;
    	
    	
    }

}
