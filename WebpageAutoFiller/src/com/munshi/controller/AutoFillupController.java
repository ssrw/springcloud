package com.munshi.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.munshi.entity.CustomMessage;
import com.munshi.entity.ErrorResponse;
import com.munshi.entity.EventDetails;
import com.munshi.entity.WebInvoice;
import com.munshi.exceptionhandlers.EmployeeException;

@Controller
public class AutoFillupController {
	@RequestMapping(value="/autoFormFilling/{link}/{candId}",method=RequestMethod.GET)
	public ResponseEntity<CustomMessage> autoFormFilling(@PathVariable("link") String link, @PathVariable("candId") String candId) throws EmployeeException, URISyntaxException{
		/*System.setProperty("webdriver.gecko.driver", "D:/My Java Workspace/WebpageAutoFiller/com.munshi.webdriverexecutable/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(link);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement link1 = driver.findElement(By.linkText("English"));
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.elementToBeClickable(link1));
		link1.click();
	    //Thread.sleep(5000);
		
		//WebElement searchBox = driver.findElement(By.id("searchInput"));
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='search']"));
		WebDriverWait wait1 = new WebDriverWait(driver, 2000);
		wait1.until(ExpectedConditions.elementToBeClickable(searchBox));
		searchBox.sendKeys("software");
		
		WebElement searchBoxSubmit = driver.findElement(By.xpath("//input[@name='go']"));
		WebDriverWait wait2 = new WebDriverWait(driver, 2000);
		wait2.until(ExpectedConditions.elementToBeClickable(searchBox));
		searchBoxSubmit.click();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		if("emp123".equalsIgnoreCase(candId)){
			throw new EmployeeException("You need to check your candidate ID");
		}
		/*CustomMessage cusMsg = new CustomMessage();
		cusMsg.setMessage("Connection is Successful");
		cusMsg.setStatus("Success");
		return cusMsg;*/
		/*final String uri = "http://localhost:8081/WebpageAutoFiller/getEvent/1234";
	    RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
	    ResponseEntity<EventDetails> result = restTemplate.exchange(uri, HttpMethod.GET, null, EventDetails.class);*/
	    
	    final String uriRst = "http://localhost:8081/WebpageAutoFiller/charge";
	    
	    WebInvoice invoice = new WebInvoice();
	    invoice.setId(200);
	    invoice.setStatus("Draft");
	 
	   /* RestTemplate restTemplate1 = new RestTemplate();
	    String result1 = restTemplate1.postForObject( uriRst, invoice, String.class);
	 
	    System.out.println(result1);*/
	    System.out.println("Hi Completed post also");
	    
	    RequestEntity request = RequestEntity
	    		     .post(new URI(uriRst))
	    		     .accept(MediaType.APPLICATION_JSON).header("headers")
	    		     .body(invoice);
	    ResponseEntity<String> response = new RestTemplate().exchange(request, String.class);
	    
	    
		CustomMessage cusMsg = new CustomMessage();
		cusMsg.setMessage("Connection is Successful");
		cusMsg.setStatus("Success");
		return new ResponseEntity<CustomMessage>(cusMsg, HttpStatus.OK);

		
	}
	
	@RequestMapping(value="/getEvent/{id}",method=RequestMethod.GET)
	public ResponseEntity<EventDetails> getEvent(@PathVariable("id") String eventId){
	   EventDetails eventObj = new EventDetails();
	   eventObj.setId("EVT123");
	   eventObj.setStatus("Executed");
	   System.out.println("Hello");
	   return new ResponseEntity<EventDetails>(eventObj, HttpStatus.OK);
	  
	}
	
	@RequestMapping(value="/charge",method=RequestMethod.POST)
	public ResponseEntity<String> charge(@RequestBody WebInvoice invoice){
	   EventDetails eventObj = new EventDetails();
	   eventObj.setId("EVT123");
	   eventObj.setStatus("Executed");
	   System.out.println("Hello");
	   System.out.println(invoice.getId()+"------"+invoice.getStatus());
       return new ResponseEntity<String>("Success", HttpStatus.OK);
	  
	}
	
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
	        ErrorResponse error = new ErrorResponse();
	        error.setErrorcode(HttpStatus.PRECONDITION_FAILED.value());
	        error.setErrorMessage(ex.getMessage());
	        return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
	}


}
