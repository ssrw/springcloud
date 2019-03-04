package serviceFiles;

import java.util.List;

import beanFiles.ExamResult;
import dataAccessObject.ExamResultDAO;

public class ExamResultService {
	
	private ExamResultDAO exmRsltDao;

	public ExamResultDAO getExmRsltDao() {
		return exmRsltDao;
	}

	public void setExmRsltDao(ExamResultDAO exmRsltDao) {
		this.exmRsltDao = exmRsltDao;
	}
	
	public int saveExamResult(List<ExamResult> examResultList ){
		return this.getExmRsltDao().saveExamResultInBatch(examResultList);
	}
	

}
