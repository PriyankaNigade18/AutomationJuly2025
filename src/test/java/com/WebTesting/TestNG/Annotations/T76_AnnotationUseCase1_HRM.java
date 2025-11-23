package com.WebTesting.TestNG.Annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class T76_AnnotationUseCase1_HRM extends BaseClass
{
	//WebDriver driver;
	
	@Test(priority=1)
	  public void testLogin() throws InterruptedException
	  {
		  
		  System.out.println("User Login test started....");
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(1000);
		  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	  }
	  
	  @Test(priority=2)
	  public void testLogout()
	  {
		  driver.findElement(By.className("oxd-userdropdown-icon")).click();
		  driver.findElement(By.linkText("Logout")).click();
		  System.out.println("User Logout test Completed....");

	  }
	
//	@BeforeClass
//	public void setUp()
//	{
//		System.out.println("Browser Session started....");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//	}
//	@BeforeMethod
//	public void getAppUrl()
//	{
//		System.out.println("Url is: "+driver.getCurrentUrl());
//	}
//	
//	@AfterMethod
//	public void getAppTitle()
//	{
//		System.out.println("Title is: "+driver.getTitle());
//	}
	
  
  
//  @AfterClass
//  public void tearDown()
//  {
//	  driver.quit();
//	  System.out.println("Browser session closed");
//  }
  
}
