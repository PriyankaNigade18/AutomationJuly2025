package com.WebTesting.ElementAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T38_JavascriptExecutorHiddenElement {
  @Test
  public void testHiddlenElement() throws InterruptedException
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.letskodeit.com/practice");
	  
	  //click on hide button
	  driver.findElement(By.id("hide-textbox")).click();
	  
	  //input box
	  //driver.findElement(By.id("displayed-text")).sendKeys("testing...");
	  //ElementNotInteractableException: element not interactable: element is hidden
	  
	  //hidden elements we can handle using JavascriptExecutor
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("document.getElementById('displayed-text').value='testing...'");
	  
	  Thread.sleep(2000);
	  
	  //click on show button
	  driver.findElement(By.id("show-textbox")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
