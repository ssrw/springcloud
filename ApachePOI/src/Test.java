import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;








import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Test {
	
	private static final String FILE_NAME = "F:/ClassSchedule.xlsx";

	public static void main(String[] args) {
		
	/*	
		    XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
	        
	        List<String> list = new ArrayList<String>();
	        list.add("Name");
	        list.add("Address");
	        list.add("Phone Number");
	        
	        String arr[] = list.toArray(new String[list.size()]);
	        
	        Object[][] datatypes = {
	                {"Name", "Address", "Phone number"},
	                {"Caz", "Barasat", "985852569"},
	                {"Aife", "Mirapota", "9635202091"},
	              
	                
	        };
	    
	        

	        int rowNum = 0;
	        System.out.println("Creating excel");
	        Row row = sheet.createRow(rowNum++);
	        int colNum = 0;
	        for (String datatype : list) {
	        
	            
	            Cell cell = row.createCell(colNum++);
	            if (datatype instanceof String) {
	                    cell.setCellValue((String) datatype);
	            }
	           
	        }

	        try {
	            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
	            workbook.write(outputStream);
	            //workbook).close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Done");*/
		
		try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    //getCellTypeEnum shown as deprecated for version 3.15
                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
                    
                        System.out.print((String) currentCell.getStringCellValue() + "--");
                    
                    
                    }

                }
                System.out.println();

            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


	}

}
