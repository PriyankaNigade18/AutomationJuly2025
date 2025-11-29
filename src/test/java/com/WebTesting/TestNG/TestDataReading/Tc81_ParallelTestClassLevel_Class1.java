package com.WebTesting.TestNG.TestDataReading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc81_ParallelTestClassLevel_Class1
{
	@Test
	  public void testFirefox()
	  {
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.Amazon.com");
		  System.out.println("Title is: "+driver.getTitle());
		  
	  }
	  
}
