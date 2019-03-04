package com.munshi.Entity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWebUsingWebdriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "WebDriverExecutable/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*WebElement link = driver.findElement(By.linkText("English"));
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.elementToBeClickable(link));
		link.click();*/
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
		
		
		/*try {
			//Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		

	}

}
