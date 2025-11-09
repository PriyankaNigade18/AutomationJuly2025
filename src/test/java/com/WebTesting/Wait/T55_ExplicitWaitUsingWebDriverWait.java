package com.WebTesting.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.Utility;

public class T55_ExplicitWaitUsingWebDriverWait {
  @Test
  public void testWait()
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  driver.findElement(By.tagName("button")).click();
	  //wait
	  By textLoc=By.xpath("(//h4)[2]");
	  String actText=Utility.waitForElementVisibility(driver,textLoc).getText();
	  //String actText=driver.findElement(By.xpath("(//h4)[2]")).getText();
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
