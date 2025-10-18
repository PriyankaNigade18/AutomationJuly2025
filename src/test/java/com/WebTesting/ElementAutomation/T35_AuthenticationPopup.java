package com.WebTesting.ElementAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T35_AuthenticationPopup {
  @Test
  public void testAuthPopup() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  //authentication
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  String text=driver.findElement(By.tagName("p")).getText();
	  System.out.println(text);
	  
	  
	  
	  
	  
  }
}
