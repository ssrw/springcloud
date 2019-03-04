package dataAccessObject;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;




import constantFiles.CustomCalendar;
import eduCalc.RandomNumGen;
import beanFiles.ClassSchedule;
import beanFiles.StudentAttendance;

public class StudentAttendanceDAO {
	
	
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int saveStudentAttendance(StudentAttendance stAttendance) {
		String strRandd = RandomNumGen.getRandomIntegerAsString();
		Random rand = new Random();
		int num = rand.nextInt(32768) +1;
		String strNum = String.valueOf(num);
		Date date = stAttendance.getClassDate();
		String strDate = CustomCalendar.dateToStringConverter(date);
	    StringBuilder str = new StringBuilder();
	    str.append(stAttendance.getRegNo()).append(strDate).append(stAttendance.getAttendanceStat()).append(strNum);
	    final String QUERY_SAVE = "insert into t_student_attendance values (?,?,?,?,?,?,?,?)";
	    int inserInd =template.update( QUERY_SAVE, new Object[] { stAttendance.getName(),stAttendance.getRegNo(),stAttendance.getDept(),stAttendance.getBranch(),stAttendance.getYear(),stAttendance.getClassDate(),stAttendance.getAttendanceStat(),str});
	    return inserInd;
	    
	}

}
