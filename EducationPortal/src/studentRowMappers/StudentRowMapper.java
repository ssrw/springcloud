package studentRowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import constantFiles.StudentConstant;
import beanFiles.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int arg1) throws SQLException {
		Student student = new Student();
		student.setName(rs.getString(StudentConstant.STUDENT_NAME));
		student.setRegno(rs.getString(StudentConstant.STUDENT_REG_NO));
		student.setAddress(rs.getString(StudentConstant.STUDENT_ADDR));
		student.setContactno(rs.getString(StudentConstant.STUDENT_CNTACT_NO));
		student.setEmail(rs.getString(StudentConstant.STUDENT_EMAIL));
		student.setDept(rs.getString(StudentConstant.STUDENT_DEPT));
		student.setGuardianname(rs.getString(StudentConstant.STUDENT_GUARDIAN_NAME));
		student.setGuardiancntctno(rs.getString(StudentConstant.STUDENT_CNTACT_NO));
		return student;
	}

}
