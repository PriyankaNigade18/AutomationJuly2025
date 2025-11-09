package com.WebTesting.ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T58_DoubleClickAction {
  @Test
  public void testDoubleClick() throws InterruptedException 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //ele
	  WebElement button=driver.findElement(By.tagName("button"));
	  
	  //action
	  Actions act=new Actions(driver);
	  //act.moveToElement(button).doubleClick().build().perform();
	  act.doubleClick(button).perform();
	  
	  //alert should open
	  Thread.sleep(2000);
	  
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert text: "+alt.getText());
	  //ok
	  alt.accept();
	  
	  
	  
	  
	  
  }
}
