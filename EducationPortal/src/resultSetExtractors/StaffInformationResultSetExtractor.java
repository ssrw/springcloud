package resultSetExtractors;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import constantFiles.StaffConstant;
import beanFiles.Staff;

public class StaffInformationResultSetExtractor implements ResultSetExtractor<List<Staff>> {

	@Override
	public List<Staff> extractData(ResultSet rs) throws SQLException,
			DataAccessException {
				List<Staff> list=new ArrayList<Staff>();  
		        while(rs.next()){  
			        Staff staffObj = new Staff();  
			        staffObj.setEmail(rs.getString(StaffConstant.EMAIL));  
			        staffObj.setRegno(rs.getString(StaffConstant.REG_NO));
			        staffObj.setStatus(rs.getString(StaffConstant.STATUS));
			        list.add(staffObj);  
               }  
             return list;  
	      }

}
