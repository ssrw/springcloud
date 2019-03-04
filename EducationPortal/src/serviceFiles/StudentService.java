package serviceFiles;

import java.util.ArrayList;
import java.util.List;

import beanFiles.Student;
import dataAccessObject.StudentDAO;

public class StudentService {
	
	private StudentDAO stDao;

	public StudentDAO getStDao() {
		return stDao;
	}

	public void setStDao(StudentDAO stDao) {
		this.stDao = stDao;
	}
	
	public ArrayList<Student> fetchAllstudents(){
		return this.getStDao().fetchAllStudentsRecords();
	}
	
	public String fetchStatusOfStudent(Student st){
		return this.getStDao().fetchStudentStatus(st);
	}
	
	
}
