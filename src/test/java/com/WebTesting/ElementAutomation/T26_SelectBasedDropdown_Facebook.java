package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.WebTesting.Generic.Utility;

public class T26_SelectBasedDropdown_Facebook {
  @Test
  public void testDropdown() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.facebook.com/");
	  
	  //create new account link
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  //navigation to create new account page
	  //day
	  WebElement dayEle=driver.findElement(By.id("day"));
	  Utility.selectBasedDropdown(dayEle,"27");
	  
	  //month
	  WebElement monthEle=driver.findElement(By.id("month"));
	  Utility.selectBasedDropdown(monthEle,"Dec");
	  
	  //year
	  WebElement yearEle=driver.findElement(By.id("year"));
	  Utility.selectBasedDropdown(yearEle,"2010");
	  
	  
//	  Select dd=new Select(dayEle);
//	  System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
//	  
//	  List<WebElement> allOptions=dd.getOptions();
//	  System.out.println("Total options are: "+allOptions.size());
//	  
//	  for(WebElement i:allOptions)
//	  {
//		  System.out.println(i.getText());
//		  if(i.getText().contains("28"))
//		  {
//			  i.click();
//			  break;
//		  }
//	  }
	  
	 
	  
	
	  
	  
	  
	  
	  
	  //year
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
