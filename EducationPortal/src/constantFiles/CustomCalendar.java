package constantFiles;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomCalendar {
	
	public static final String DATE_FORMAT_NOW = "yyyy-MM-dd";
	
	public static String dateToStringConverter(Date date) {

		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		String stringDate = sdf.format(date);
		return stringDate;

	}
	
	public static Date stringToDateConverter(String stringDate){
		
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		Date date = null;
		try {
		       date = sdf.parse(stringDate);
		
		} catch(Exception e){
		     //handle exception
		}
		return date;
		
	}

}
