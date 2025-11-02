package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T42_RedBusCalendarAutomation {
  @Test
  public void testCalendar()
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  driver.findElement(By.xpath("(//i[contains(@class,'icon-date_range')])[1]")).click();
	  
	  //expectation
	  String edate="6";
	  String emonth="April";
	  String eyear="2026";
	  
	  //select month
	  while(true)
	  {
		  String monthyear=driver.findElement(By.xpath("//p[contains(@class,'monthYear')]")).getText();
	  
	  //System.out.println(monthyear);//[November,2025]
	  String cmonth=monthyear.split(" ")[0];
	  String cyear=monthyear.split(" ")[1];
//	  System.out.println("Current month: "+cmonth);
//	  System.out.println("Current Year: "+cyear);
	  
	  //compare current with expected month
	  if(cmonth.contains(emonth) && cyear.contains(eyear))
	  {
		  break;
	  }else
	  {
		  //click on arrow
		  driver.findElement(By.xpath("//i[contains(@aria-label,'Next month')]")).click();
	  }
	  
	  
	  }
	  
	  	  
	  //select date
	  List<WebElement> allDates=driver.findElements(By.xpath("//div[contains(@class,'date___')]//span"));
	  for(WebElement date:allDates)
	  {
		  if(date.getText().contains(edate))
		  {
			  date.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
