package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.Utility;

public class T31_MultipleWindowsAutomationWithUtility {
  @Test
  public void testMultipleWindows() throws InterruptedException 
  {
	  
	//create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  String parentId=driver.getWindowHandle();
	  
	  //open all links to get number of windows
	  List<WebElement> allLinks=driver.findElements(By.xpath("//a[@href]"));//5
	  
	  for(WebElement link:allLinks)
	  {
		  link.click();
		  
	  }
	  
	  //get all windows id/session ids
	  Set<String> allWindowsHandle=driver.getWindowHandles();
	  
	  //order collection set--->list
	  List<String> allHandles=new ArrayList<String>(allWindowsHandle);
	  
	  
	  
	  //close all child windows
	  //Utility.closeAllChildWindows(driver,allHandles,parentId);
	  
	  /*
	  //how to switch specific window
	  for(String windowId:allHandles)//[101,102,103,104,105]
	  {
		  //get the title of every window
		  String title=driver.switchTo().window(windowId).getTitle();
		  if(title.contains("YouTube"))
		  {
			  System.out.println("Found right window");
			  System.out.println("Current url: "+driver.getCurrentUrl());
			  System.out.println("Title is: "+driver.getTitle());
			  break;
		  }
	  }
	  */
	  Utility.switchToExpectedWindow(driver,allHandles,"YouTube");
	  
	  Thread.sleep(2000);
	  
	  //parent window
	  driver=Utility.switchToParentWindow(driver,parentId);
	  
	  //username
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  Thread.sleep(2000);
	  //switch to child
	  Utility.switchToExpectedWindow(driver,allHandles,"Facebook");
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
