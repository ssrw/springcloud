package org.aife.messenger;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Link.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;
import javax.ws.rs.core.UriInfo;

import Exception.DataNotFoundException;

@Path("/hello")
public class MessageSender {
	
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
	@Path("/main")
    public String getIt() {
        return "Got it!";
    }
	
	MessageService n =new MessageService();
/*	@GET
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Message sendMessage(@PathParam("messageId") Long id){
		return n.fetchData(id);
	}*/
	
	@GET
	@Path("/identity")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Response sendMessage1(@Context UriInfo info){
		
		String id = info.getQueryParameters().getFirst("employeeid");
		Long id1=Long.valueOf(id);
		String name=n.fetchData(id1).getName();
		return Response
				   .status(200)
				   .entity(n.fetchData(id1)/*"Name of the emploee is :"+name*/).build();
		
		
	}
	
	@POST
	@Path("/insert/{messageId}/{attributeName}")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Message insertMessage(@PathParam("messageId") Long id , @PathParam("attributeName") String name){
		
	/*	String id = info.getQueryParameters().getFirst("employeeid");
		Long id1=Long.valueOf(id);
		String name=n.fetchData(id1).getName();
		return Response
				   .status(200)
				   .entity(n.fetchData(id1)"Name of the emploee is :"+name).build();*/
		return n.insertMessage(id, name);
		
		
	}
	
	@GET
	@Path("/fetchallmessages/{name}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> fetchAllMessages(@PathParam("name") String sname){
		
		return n.fetchAllIds(sname);
		
	}
	
	@GET
	@Path("/test")
	public String  test(){
		
		// String uri = "http://localhost:8080/messenger/hello/fetchallmessage/aife munshi";

			

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
			
		 return "hiiii";
		
	}
	
	
	@GET
	@Path("/fetchallmessage/{name}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response  fetchAllMessage(@PathParam("name") String sname){
		System.out.println(sname);
		List<Message> messages = n.fetchAllIds(sname);//a list of entities
		     GenericEntity<List<Message>> list = new GenericEntity<List<Message>>(messages) {};
		     System.out.println(messages.get(0).getId());
		        //return Response.ok(list).build();
		     if(messages!=null){
		       return Response.status(200).entity(list).build();
		     }else{
		    	 return Response.status(404).entity(list).build();
		     }
		
		
	}
	
	@GET
	@Path("/fetchallmessage1/{name}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message  fetchAllMessage1(@PathParam("name") String sname){
		
		List<Message> messages = n.fetchAllIds(sname);//a list of entities
		    
		        //return Response.ok(list).build();
		
		return messages.get(0);
		
		
	}
	
	
	@POST
	@Path("/fetchallmessage2")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message  fetchAllMessage2(Message msg){
		/*String name = null;
		if(msg!=null && msg.getStmt()!=null && msg.getStmt().getWords()!=null){
			 name = msg.getStmt().getWords();
		}*/
		
		List<Message> messages = n.fetchAllIds(msg.getName());//a list of entities
		    
		        //return Response.ok(list).build();
		
		return messages.get(0);
		
		
	}
	
	
	
}
