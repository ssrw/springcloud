package com.munshi.Entity;

import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class MainFiles {
	
	public static void main(String args[]){
		WebClient webClient = new WebClient();
		try {
			HtmlPage currentPage = webClient.getPage("https://scholarships.gov.in/loginPage");
			//String pageContent = currentPage.asText();
			HtmlInput queryInput = currentPage.getElementByName("pass");
			queryInput.setValueAttribute("aviyehuda");
		} catch (FailingHttpStatusCodeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
