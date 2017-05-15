package Practice;

import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import Entity.Message;

public class PracticeRestClient {
	
	public static void main(String[] args) {
		/*try{
			 javax.ws.rs.client.Client client = ClientBuilder.newClient();
			 
			 String uri = "http://localhost:8080/messenger/webapi/hello/fetchallmessage1/jghkgj4";
			 URL url = new URL(uri.toString());

			 WebTarget resource = client.target(url.toString());

			 javax.ws.rs.client.Invocation.Builder request1 = resource.request();
			 request1.accept(MediaType.APPLICATION_JSON);
			
			 if (request1.get().getStatus()==200) {
				 Message msg = request1.get(Message.class);
				    System.out.println(msg.getId()+"---->"+msg.getName());
			 } else {
				    System.out.println("ERROR! " + request1.get().getStatus());
				    System.out.println(request1.get().toString());	   
			 }

			
				   
		  }
	      catch(Exception e){
	    	  System.out.println("Check your url");
	    	 
	      }*/
		
		  javax.ws.rs.client.Client client = ClientBuilder.newClient();
		  Response response =client.target("http://localhost:8080/messenger/webapi/hello/fetchallmessage1/hello").request().get();
		  Message msg = response.readEntity(Message.class);/*client.target("http://localhost:8080/messenger/webapi/hello/fetchallmessage1/hello").request().get((Message.class));*/
		  System.out.println(msg);
		 
		  
		  
	}

}
