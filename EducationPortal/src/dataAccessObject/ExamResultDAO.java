package dataAccessObject;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import beanFiles.ClassSchedule;
import beanFiles.ExamResult;

public class ExamResultDAO {
	
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int saveExamResultInBatch(final List<ExamResult> examResultList) {
	    final int batchSize = 500;
	    final String QUERY_SAVE = "insert into t_exam_result (student_name,student_dept,student_year,student_branch,student_regno,student_first_sub_name,student_first_sub_marks,student_second_sub_name,student_second_sub_marks,student_third_sub_name,student_third_sub_marks,student_fourth_sub_name,student_fourth_sub_marks,student_fifth_sub_name,student_fifth_sub_marks,student_sixth_sub_name,student_sixth_sub_marks,student_seventh_sub_name,student_seventh_sub_marks,student_eighth_sub_name,student_eighth_sub_marks,student_nineth_sub_name,student_nineth_sub_marks,student_tenth_sub_name,student_tenth_sub_marks,student_eleventh_sub_name,student_eleventh_sub_marks) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    int successIndicator[] = null;
	    for (int j = 0; j < examResultList.size(); j += batchSize) {

	        final List<ExamResult> batchList = examResultList.subList(j, j + batchSize > examResultList.size() ? examResultList.size() : j + batchSize);

	        successIndicator = this.getTemplate().batchUpdate(QUERY_SAVE,
	            new BatchPreparedStatementSetter() {
	         

					@Override
					public void setValues(PreparedStatement ps, int i)
							throws SQLException {
						 ExamResult exm = batchList.get(i);
		                 ps.setString(1, exm.getStudentName());
		                 ps.setString(2, exm.getDept());
		                 ps.setString(3, exm.getYear());
		                 ps.setString(4, exm.getBranch());
		                 ps.setString(5, exm.getRegNo());
		                 ps.setString(6, exm.getFirstSubName());
		                 if("NA".equalsIgnoreCase(exm.getFirstSubMarks()) || "N/A".equalsIgnoreCase(exm.getFirstSubMarks())){
		                   ps.setDouble(7, (Double) null);
		                 }else{
		                	 ps.setDouble(7, Double.valueOf(exm.getFirstSubMarks()));
		                 } 
		                 ps.setString(8, exm.getSecondSubName());
		                 if("NA".equalsIgnoreCase(exm.getSecondSubMarks()) || "N/A".equalsIgnoreCase(exm.getSecondSubMarks())){
		                   ps.setDouble(9, (Double) null);
		                 }else{
		                	 ps.setDouble(9, Double.valueOf(exm.getSeventhSubMarks()));
		                 }
		                 ps.setString(10, exm.getThirdSubName());
		                 ps.setDouble(11, Double.valueOf(exm.getThirdSubMarks()));
		                 ps.setString(12, exm.getFourthSubName());
		                 ps.setDouble(13, Double.valueOf(exm.getFourthSubMarks()));
		                 ps.setString(14, exm.getFifthSubName());
		                 ps.setDouble(15, Double.valueOf(exm.getFifthSubMarks()));
		                 ps.setString(16, exm.getSixthSubName());
		                 ps.setDouble(17, Double.valueOf(exm.getSixthSubMarks()));
		                 ps.setString(18, exm.getSeventhSubName());
		                 ps.setDouble(19, Double.valueOf(exm.getSeventhSubMarks()));
		                 ps.setString(20, exm.getEighthSubName());
		                 ps.setDouble(21, Double.valueOf(exm.getEighthSubMarks()));
		                 ps.setString(22, exm.getNinethSubName());
		                 ps.setDouble(23, Double.valueOf(exm.getNinethSubMarks()));
		                 ps.setString(24, exm.getTenthSubName());
		                 ps.setDouble(25, Double.valueOf(exm.getTenthSubMarks()));
		                 ps.setString(26, exm.getEleventhSubName());
		                 ps.setDouble(27, Double.valueOf(exm.getEleventhSubMarks()));
		                 
						
					}
					
					@Override
	                public int getBatchSize() {
	                    return batchList.size();
	                }
	            });

	    }
	    boolean flag = true;
	    for(int k=0;k<=successIndicator.length-1;k++){
	    	if(successIndicator[k] == 0){
	    		flag = false;
	    	}
	    }
	    if(flag == true){
	    	return 1;
	    }else{
	    	return 0;
	    }
	    
	    
	}

}
