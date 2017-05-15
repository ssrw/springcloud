package org.koushik.javabrains.Passenger;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.jws.WebResult;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

import org.glassfish.jersey.client.ClientResponse;

import com.sun.security.ntlm.Client;

public class A {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, MalformedURLException {
		// TODO Auto-generated method stub
		//Exact working code
		try{
		 javax.ws.rs.client.Client client = ClientBuilder.newClient();
		 
		 String uri = "http://localhost:8080/messenger/webapi/hello/fetchallmessage1/hello";
		 URL url = new URL(uri.toString());

		 WebTarget resource = client.target(url.toString());

		 javax.ws.rs.client.Invocation.Builder request = resource.request();
		 request.accept(MediaType.APPLICATION_JSON);
		 Message msg = request.get(Message.class);
		 if (request.get().getStatus()==200) {
			    System.out.println(msg.getId()+"---->"+msg.getName());
		 } else {
			    System.out.println("ERROR! " + request.get().getStatus());
		 }

		
			   
	  }
      catch(Exception e){
    	  System.out.println("Check your url");
    	 
      }
	}
	
	public void run() throws IOException{
		System.out.println("hello");
	}
}
