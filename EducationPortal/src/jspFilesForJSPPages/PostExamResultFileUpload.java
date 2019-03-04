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

import serviceFiles.ClassScheduleService;
import serviceFiles.ExamResultService;
import serviceFiles.StudentAttendanceService;
import serviceFiles.StudentService;
import beanFiles.ClassSchedule;
import beanFiles.ExamResult;
import beanFiles.Student;
import beanFiles.StudentAttendance;
import constantFiles.CustomCalendar;
import constantFiles.StudentConstant;
import filePaths.ExcelFilePath;

/**
 * Servlet implementation class PostExamResultFileUpload
 */
@WebServlet("/PostExamResultFileUpload")
public class PostExamResultFileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private WebApplicationContext webApplicationContext;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostExamResultFileUpload() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException {
		super.init(config);
		webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {

            FileInputStream excelFile = new FileInputStream(new File(ExcelFilePath.EXAM_RESULT_FILE_UPLOAD));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();
            
            List<ExamResult> examResultList = new ArrayList<ExamResult>();

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                List<String> list = new ArrayList<String>();
                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    list.add((String) currentCell.getStringCellValue());
                }
                
                ExamResult exmRsltOb = new ExamResult();
                ExamResult bean = this.setupBeanForExamResult(exmRsltOb, list);
                examResultList.add(bean);

           }
            
            StudentService stServObj = (StudentService) webApplicationContext
					.getBean("studentService"); 
            List<ExamResult> listToBeSentAsFinal = new ArrayList<ExamResult>();
			for (ExamResult exmRslt : examResultList) {

				Student stOb = new Student();
				stOb.setName(exmRslt.getStudentName());
				stOb.setRegno(exmRslt.getRegNo());
				String status = stServObj.fetchStatusOfStudent(stOb);

				if (StudentConstant.ACTIIVE_STUDENT.equals(status)) {
					listToBeSentAsFinal.add(exmRslt);
				}

			}
            
            ExamResultService exmRsltOb = (ExamResultService) webApplicationContext
					.getBean("exmResult");  
			int successInd = exmRsltOb.saveExamResult(listToBeSentAsFinal);
                
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
	
	public ExamResult setupBeanForExamResult(ExamResult bean,List<String> list){
		 bean.setStudentName(list.get(0));
		 bean.setDept(list.get(1));
		 bean.setYear(list.get(2));
		 bean.setBranch(list.get(3));
		 bean.setYear(list.get(4));
		 bean.setRegNo(list.get(5));
		 bean.setFirstSubName(list.get(6));
		 bean.setFirstSubMarks(list.get(7));
		 bean.setSecondSubName(list.get(8));
		 bean.setSecondSubMarks(list.get(9));
		 bean.setThirdSubName(list.get(10));
		 bean.setThirdSubMarks(list.get(11));
		 bean.setFourthSubName(list.get(12));
		 bean.setFourthSubMarks(list.get(13));
		 bean.setFifthSubName(list.get(14));
		 bean.setFifthSubMarks(list.get(15));
		 bean.setSixthSubName(list.get(16));
		 bean.setSixthSubMarks(list.get(17));
		 bean.setSeventhSubName(list.get(18));
		 bean.setSeventhSubMarks(list.get(19));
		 bean.setEighthSubName(list.get(20));
		 bean.setEighthSubMarks(list.get(21));
		 bean.setNinethSubName(list.get(22));
		 bean.setNinethSubMarks(list.get(23));
		 bean.setTenthSubName(list.get(24));
		 bean.setEleventhSubName(list.get(25));
		 bean.setEleventhSubMarks(list.get(26));
		 
		 
		 return bean;
		
	}

}
