package studentRowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import constantFiles.StudentConstant;
import beanFiles.StaffDesignation;
import beanFiles.Student;

public class StaffDesignationRowmapper implements RowMapper<StaffDesignation> {

	@Override
	public StaffDesignation mapRow(ResultSet rs, int arg1)
			throws SQLException {
		
		StaffDesignation designation = new StaffDesignation();
		designation.setId((int) rs.getLong("designation_id"));
		designation.setDesignation_name(rs.getString("designation_name"));
		return designation;
		
	}

}
