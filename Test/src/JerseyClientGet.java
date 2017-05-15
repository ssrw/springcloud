import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

import org.glassfish.jersey.client.ClientResponse;

import com.sun.security.ntlm.Client;


public class JerseyClientGet {

  public static void main(String[] args) {
	  Client client = ClientBuilder.newClient();

		 WebTarget resource = client.target("http://localhost:8080/messenger/webapi/hello/fetchallmessage/hello");

		 javax.ws.rs.client.Invocation.Builder request = resource.request();
		 request.accept(MediaType.APPLICATION_JSON);

		 Response response = request.get();

		 if (response.getStatusInfo().getFamily() == Family.SUCCESSFUL) {
		     System.out.println("Success! " + response.getStatus());
		     System.out.println(response.getEntity());
		 } else {
		     System.out.println("ERROR! " + response.getStatus());    
		     System.out.println(response.getEntity());
		 }
}
}