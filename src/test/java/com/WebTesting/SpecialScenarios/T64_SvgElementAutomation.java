package com.WebTesting.SpecialScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T64_SvgElementAutomation {
  @Test
  public void testSvgElement()
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  
	  //svg
	  List<WebElement> list=driver.findElements(By.xpath("//a//*[local-name()='svg']"));
	  System.out.println("Total svg elements are: "+list.size());
	  
	  /*
	  int count=0,exp=3;
	  for(WebElement i:list)
	  {
		  count++;
		  if(count==exp)
		  {
			  i.click();
			  break;
		  }
		  
	  }
	  */
	  
	  for(WebElement i:list)
	  {
		  i.click();
	  }
	  
	  
	  
  }
}
