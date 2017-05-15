package org.souvik.calender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.sun.security.ntlm.Client;

public class TstClient{

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, MalformedURLException {
		// TODO Auto-generated method stub
		//Exact working code
		try{
			 javax.ws.rs.client.Client client = ClientBuilder.newClient();
			 
			 String uri = "http://localhost:8080/Passenger/webapi/myresource/test";
			 URL url = new URL(uri.toString());

			 WebTarget resource = client.target(url.toString());
			 

			 javax.ws.rs.client.Invocation.Builder request = resource.request();
			 request.accept(MediaType.APPLICATION_JSON);
			 String msg = request.get(String.class);
			 if (request.get().getStatus()==200) {
				    System.out.println(msg);
			 } else {
				    System.out.println("ERROR! " + request.get().getStatus());
			 }

			
				   
		  }
	      catch(Exception e){
	    	  System.out.println("Check your url");
	    	 
	      }
	}
}
