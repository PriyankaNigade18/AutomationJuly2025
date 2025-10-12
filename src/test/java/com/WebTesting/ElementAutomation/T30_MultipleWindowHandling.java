package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class T30_MultipleWindowHandling {
  @Test
  public void testMultipleWindow() throws InterruptedException 
  {

	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //Parent window
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  //link
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  //Navigating to next page child page
	  
	  Set<String> allWindowIds=driver.getWindowHandles();
	  System.out.println(allWindowIds);
	  
	  //child switch
	  for(String childId:allWindowIds)
	  {
		  if(!parentId.equals(childId))//if parent id is not equal to child id then switch
		  {
			  //switch
			  driver.switchTo().window(childId);
			  
			  System.out.println("Title is: "+driver.getTitle());
			  
			  //enter email
			 driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			  
			 //driver.close();//current active window
			 //driver.quit();//all open windows by selenium
			  
		  }
	  }
	  
	  //parent scope
	  driver.switchTo().window(parentId);
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
  }
}
