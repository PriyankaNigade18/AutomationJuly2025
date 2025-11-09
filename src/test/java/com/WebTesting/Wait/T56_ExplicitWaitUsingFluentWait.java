package com.WebTesting.Wait;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.WebTesting.Generic.Utility;

public class T56_ExplicitWaitUsingFluentWait {
  @Test
  public void testFluentWait()
  {
	//create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  driver.findElement(By.tagName("button")).click();
	  //wait
	  By textLoc=By.xpath("(//h4)[2]");
	  Wait<WebDriver> wait =new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(2))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);
	  
	  String actText=wait.until(ExpectedConditions.visibilityOfElementLocated(textLoc)).getText();
	 
	  String expText="Hello World!";
	  
	  if(actText.contains(expText))
	  {
		  System.out.println("Test Pass...Text found!");
	  }else
	  {
		  System.out.println("Test Fail....Text is not found!");
	  }
  }
}
