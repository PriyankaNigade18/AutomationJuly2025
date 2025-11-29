package com.WebTesting.TestNG.TestDataReading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc79_CrossBroswerTest
{
	public WebDriver driver;
	@Parameters({"bname"})
  @Test
  public void testGoogle(String bname) 
  {
	  switch(bname.toLowerCase())
	  {
	  case "chrome":
		  driver=new ChromeDriver();
		  break;
		  
	  case "edge":
		  driver=new EdgeDriver();
		  break;
		  
	  case "firefox":
		  driver=new FirefoxDriver();
		  break;
		  
	  	  default:
		System.out.println("Wrong Browser");
	  }
	  
	  //test case
	  driver.get("https://www.google.com");
	  System.out.println("Title is: "+driver.getTitle());
	  
	  
	  
  }
}
