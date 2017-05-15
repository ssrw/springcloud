import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class MainClass {

	
	 /* Get actual class name to be printed on */
	   
	   
	   public static void main(String[] args)throws IOException,SQLException{
		  Logger log = Logger.getRootLogger();
		  BasicConfigurator.configure();
		  log.setLevel(Level.DEBUG);
	      log.debug("Hello this is a debug message");
	      log.info("Hello this is an info message");
	      log.fatal("This is a fatal message");
	      System.out.println(log.getName());
	      
	      
	   }
}
