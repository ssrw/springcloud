package dataAccessObject;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import beanFiles.ClassSchedule;

public class ClassScheduleDAO {
	
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int saveClassScheduleBatch(final List<ClassSchedule> clsSchdlList) {
	    final int batchSize = 500;
	    final String QUERY_SAVE = "insert into t_class_schedule values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    int successIndicator[] = null;
	    for (int j = 0; j < clsSchdlList.size(); j += batchSize) {

	        final List<ClassSchedule> batchList = clsSchdlList.subList(j, j + batchSize > clsSchdlList.size() ? clsSchdlList.size() : j + batchSize);

	        successIndicator = this.getTemplate().batchUpdate(QUERY_SAVE,
	            new BatchPreparedStatementSetter() {
	         

					@Override
					public void setValues(PreparedStatement ps, int i)
							throws SQLException {
						 ClassSchedule cls = batchList.get(i);
		                 ps.setString(1, cls.getDept());
		                 ps.setString(2, cls.getBranch());
		                 ps.setString(3, cls.getYear());
		                 ps.setString(4, cls.getFirstClsSubName());
		                 ps.setString(5, cls.getFirstClsTimePeriod());
		                 ps.setString(6, cls.getFirstClassFacultyName());
		                 ps.setString(7, cls.getSecondClsSubName());
		                 ps.setString(8, cls.getSecondClsTimePeriod());
		                 ps.setString(9, cls.getSecondClassFacultyName());
		                 ps.setString(10, cls.getThirdClsSubName());
		                 ps.setString(11, cls.getThirdClsTimePeriod());
		                 ps.setString(12, cls.getThirdClassFacultyName());
		                 ps.setString(13, cls.getFourthClsSubName());
		                 ps.setString(14, cls.getFourthClsTimePeriod());
		                 ps.setString(15, cls.getFourthClassFacultyName());
		                 ps.setString(16, cls.getFifthClsSubName());
		                 ps.setString(17, cls.getFifthClsTimePeriod());
		                 ps.setString(18, cls.getFifthClassFacultyName());
		                 
						
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
