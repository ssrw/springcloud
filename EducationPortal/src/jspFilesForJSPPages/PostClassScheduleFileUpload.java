package jspFilesForJSPPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
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
import beanFiles.ClassSchedule;
import filePaths.ExcelFilePath;

/**
 * Servlet implementation class PostClassScheduleFileUpload
 */
@WebServlet("/PostClassScheduleFileUpload")
public class PostClassScheduleFileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private WebApplicationContext webApplicationContext;
    
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostClassScheduleFileUpload() {
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

            FileInputStream excelFile = new FileInputStream(new File(ExcelFilePath.CLASS_SCHEDULE_FILE_PATH));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();
            
            List<ClassSchedule> classScheduleList = new ArrayList<ClassSchedule>();

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                List<String> list = new ArrayList<String>();
                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    ClassSchedule clsSchdlOb = new ClassSchedule();
                    
                    list.add((String) currentCell.getStringCellValue());
                }
                
                ClassSchedule clsSchdlOb = new ClassSchedule();
                ClassSchedule bean = this.setupBeanForClassSchedule(clsSchdlOb, list);
                classScheduleList.add(bean);

           }
			ClassScheduleService clsOb = (ClassScheduleService) webApplicationContext
					.getBean("clsSchdl");  
			int successInd = clsOb.saveClassScheduleBatch(classScheduleList);
                
            System.out.println("Bean Formation Completed");
        } 
		
		catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	public ClassSchedule setupBeanForClassSchedule(ClassSchedule bean,List<String> list){
		 bean.setDept(list.get(0));
		 bean.setBranch(list.get(1));
		 bean.setYear(list.get(2));
		 
		 bean.setFirstClsSubName(list.get(3));
		 bean.setFirstClsTimePeriod(list.get(4));
		 bean.setFirstClassFacultyName(list.get(5));
		 
		 bean.setSecondClsSubName(list.get(6));
		 bean.setSecondClsTimePeriod(list.get(7));
		 bean.setSecondClassFacultyName(list.get(8));
		
		 bean.setThirdClsSubName(list.get(9));
		 bean.setThirdClsTimePeriod(list.get(10));
		 bean.setThirdClassFacultyName(list.get(11));
		 
		 bean.setFourthClsSubName(list.get(12));
		 bean.setFourthClsTimePeriod(list.get(13));
		 bean.setFourthClassFacultyName(list.get(14));
		 
		 bean.setFifthClsSubName(list.get(15));
		 bean.setFifthClsTimePeriod(list.get(16));
		 bean.setFifthClassFacultyName(list.get(17));
		 
		
		 return bean;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
