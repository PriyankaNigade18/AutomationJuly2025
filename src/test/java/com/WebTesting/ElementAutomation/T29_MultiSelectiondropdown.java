package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T29_MultiSelectiondropdown {
  @Test
  public void testDropdown() throws InterruptedException
  {
	  //create a driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/select-menu");
	  
	  //scroll the page
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollTo(0,5000)");
	  
	  Thread.sleep(2000);
	  WebElement ele=driver.findElement(By.xpath("//div[text()='Select...']"));
	  ele.click();
	  
	  //for all options
	  List<WebElement> allOptions=driver.findElements(By.xpath("//div[contains(@class,'css-11unzgr')]//div"));
	  for(WebElement i:allOptions)
	  {
		  i.click();
	  }
	  	
	  
	  
	  
  }
}
