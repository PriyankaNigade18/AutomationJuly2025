package com.WebTesting.TestNG.Annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Browser Session started....");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@BeforeMethod
	public void getAppUrl()
	{
		System.out.println("Url is: "+driver.getCurrentUrl());
	}
	
	@AfterMethod
	public void getAppTitle()
	{
		System.out.println("Title is: "+driver.getTitle());
	}
	
	@AfterClass
	  public void tearDown()
	  {
		  driver.quit();
		  System.out.println("Browser session closed");
	  }

}
