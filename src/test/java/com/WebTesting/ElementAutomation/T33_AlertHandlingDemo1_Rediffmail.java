package com.WebTesting.ElementAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T33_AlertHandlingDemo1_Rediffmail {
  @Test
  public void testAlert() throws InterruptedException 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  //action: click on LogIn button
	  driver.findElement(By.name("proceed")).click();
	  
	  Thread.sleep(2000);
	  
	  //handle alert
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Text of alert: "+alt.getText());
	  
	  //ok
	  alt.accept();
	  
	  //UnhandledAlertException: unexpected alert open: {Alert text : Please enter a valid user name}
	  //without handling alert enter email
	 driver.findElement(By.id("login1")).sendKeys("test1234");
	  
  }
}
