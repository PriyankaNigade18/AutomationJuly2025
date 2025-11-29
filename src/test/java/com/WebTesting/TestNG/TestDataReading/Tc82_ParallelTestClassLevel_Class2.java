package com.WebTesting.TestNG.TestDataReading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc82_ParallelTestClassLevel_Class2 {
  
	
	@Test(priority=1)
	  public void testChrome()
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com");
		  System.out.println("Title is: "+driver.getTitle());
		  
	  }
	
	@Test(priority=2)
	  public void testEdge()
	  {
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.facebook.com");
		  System.out.println("Title is: "+driver.getTitle());
		  
	  }
}
