package Exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException arg0) {
		
		DataNotFoundExceptionEntity ent = new DataNotFoundExceptionEntity("No data is found for this request", "http://www.google.com");
		return Response.status(1000).entity(ent).build();
	}

}
