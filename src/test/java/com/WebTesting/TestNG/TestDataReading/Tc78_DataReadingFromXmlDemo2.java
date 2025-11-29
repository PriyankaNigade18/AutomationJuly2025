package com.WebTesting.TestNG.TestDataReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc78_DataReadingFromXmlDemo2
{
	@Parameters({"un","psw"})
  @Test
  public void testHrmLogin(String un,String psw)
   {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.saucedemo.com/");
	  
	  driver.findElement(By.id("user-name")).sendKeys(un);
	  driver.findElement(By.id("password")).sendKeys(psw);
	  driver.findElement(By.id("login-button")).click();
	  
	  //Assertion
	  String actUrl=driver.getCurrentUrl();
	  String expUrl="inventory";
	  
	  Assert.assertTrue(actUrl.contains(expUrl),"Login Fail!");
	  System.out.println("Login completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
