import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class PropertiesHandler {
	Properties p=new Properties();
	PropertiesHandler(){
		FileReader reader = null;
		try {
			reader = new FileReader("src/student.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	      
	     
	    try {
			p.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	
	public String keyString(String key){
		
		return p.getProperty(key);
	}
	
	public void init(){
		System.out.println("Bean is going through init.");
	}
	public void destroy(){
		System.out.println("Bean will destroy now.");
	}

}
