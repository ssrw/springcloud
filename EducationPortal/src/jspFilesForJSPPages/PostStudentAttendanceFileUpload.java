package jspFilesForJSPPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import constantFiles.CustomCalendar;
import constantFiles.StudentConstant;
import serviceFiles.ClassScheduleService;
import serviceFiles.StudentAttendanceService;
import serviceFiles.StudentService;
import beanFiles.ClassSchedule;
import beanFiles.Student;
import beanFiles.StudentAttendance;
import filePaths.ExcelFilePath;

/**
 * Servlet implementation class PostStudentAttendanceFileUpload
 */
@WebServlet("/PostStudentAttendanceFileUpload")
public class PostStudentAttendanceFileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private WebApplicationContext webApplicationContext;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostStudentAttendanceFileUpload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

            FileInputStream excelFile = new FileInputStream(new File(ExcelFilePath.CLASS_ATTENDANCE_FILE_UPLOAD));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();
            
            List<StudentAttendance> classAttendanceList = new ArrayList<StudentAttendance>();

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                List<String> list = new ArrayList<String>();
                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    ClassSchedule clsSchdlOb = new ClassSchedule();
                    
                    list.add((String) currentCell.getStringCellValue());
                }
                
                StudentAttendance clsattendanceOb = new StudentAttendance();
                StudentAttendance bean = this.setupBeanForClassattendance(clsattendanceOb, list);
                classAttendanceList.add(bean);

           }
            
            StudentService stServObj = (StudentService) webApplicationContext
					.getBean("studentService"); 
            List<StudentAttendance> listToBeSentAsFinal = new ArrayList<StudentAttendance>();
            
            for (StudentAttendance studentAttendance : classAttendanceList) {
            	
            	StudentAttendanceService stAttendanceServObj = (StudentAttendanceService) webApplicationContext
    					.getBean("studentAttendanceService"); 
            	
            	Student stOb = new Student();
            	stOb.setName(studentAttendance.getName());
            	stOb.setRegno(studentAttendance.getRegNo());
            	String status = stServObj.fetchStatusOfStudent(stOb);
            	
            	if(StudentConstant.ACTIIVE_STUDENT.equals(status)){
            		int successInd = stAttendanceServObj.saveStudentAttendance(studentAttendance);
            	}
				
			}
            
           
                
            System.out.println("Bean Formation Completed");
        } 
		
		catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	public StudentAttendance setupBeanForClassattendance(StudentAttendance bean,List<String> list){
		 bean.setName(list.get(0));
		 bean.setRegNo(list.get(1));
		 bean.setDept(list.get(2));
		 bean.setBranch(list.get(3));
		 bean.setYear(list.get(4));
		 bean.setClassDate(CustomCalendar.stringToDateConverter(list.get(5)));
		 bean.setAttendanceStat(list.get(6));
		 return bean;
		
	}

}
