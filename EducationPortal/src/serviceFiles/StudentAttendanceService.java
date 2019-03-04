package serviceFiles;

import beanFiles.StudentAttendance;
import dataAccessObject.StudentAttendanceDAO;

public class StudentAttendanceService {
	
	StudentAttendanceDAO stAttendDAO ;

	public StudentAttendanceDAO getStAttendDAO() {
		return stAttendDAO;
	}

	public void setStAttendDAO(StudentAttendanceDAO stAttendDAO) {
		this.stAttendDAO = stAttendDAO;
	}
	
	public int saveStudentAttendance(StudentAttendance stAttendance){
		
		return this.getStAttendDAO().saveStudentAttendance(stAttendance);
		
	}

}
