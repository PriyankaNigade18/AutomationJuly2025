package com.WebTesting.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.WebTesting.Generic.Utility;

public class T62_ResizeTest {
  @Test
  public void testResizeEle()
  {
	  
	 //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/resizable/");
	  
	  driver.switchTo().frame(0);
	  WebElement ele=driver.findElement(By.xpath("//div[contains(@class,'ui-icon')]"));
	  
	  Actions act=Utility.performAction(driver);
	  act.moveToElement(ele).dragAndDropBy(ele,70,40).build().perform();
	  
	  
	  
	  
  }
}
