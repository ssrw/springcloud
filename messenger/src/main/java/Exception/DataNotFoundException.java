package Exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
public class DataNotFoundException extends RuntimeException {
	
	final long serialVersionUID = 1L;

	public DataNotFoundException(String message) {
		super(message);
	}

	
	

}
