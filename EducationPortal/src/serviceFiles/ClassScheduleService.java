package serviceFiles;

import java.util.List;

import beanFiles.ClassSchedule;
import dataAccessObject.ClassScheduleDAO;

public class ClassScheduleService {
	
	private ClassScheduleDAO clsDAO;

	public ClassScheduleDAO getClsDAO() {
		return clsDAO;
	}

	public void setClsDAO(ClassScheduleDAO clsDAO) {
		this.clsDAO = clsDAO;
	}
	
	public int saveClassScheduleBatch(List<ClassSchedule> list){
		return this.clsDAO.saveClassScheduleBatch(list);
	}

}
