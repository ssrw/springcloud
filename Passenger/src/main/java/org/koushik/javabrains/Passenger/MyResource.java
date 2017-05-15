package org.koushik.javabrains.Passenger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.TEXT_PLAIN)
    @Path("/hello/{id}")
    public Passage okay(@PathParam("id") long idd) {
    	Handler ob1= new Handler();
    	//ob1.fetch();
    	return ob1.fetch(idd);
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/test")
    public String message() {
    	return "Got it";
        
    }
 
   @GET
   @Produces(MediaType.APPLICATION_JSON)	
   @Consumes(MediaType.APPLICATION_JSON)
   @Path("/fetch/{playername}")
   public Player senderPlayer(@PathParam("playername") String name){	
   {
    		Player player= new Player();
    		player.setPlayerId("10");
    		player.setPlayername("souvik");
    		return player;
 
   }
  }
}
