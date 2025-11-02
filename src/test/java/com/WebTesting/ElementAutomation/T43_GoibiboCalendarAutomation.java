package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class T43_GoibiboCalendarAutomation {
  @Test
  public void testCalendar() 
  {
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  
	  
	//create driver session
	  WebDriver driver=new ChromeDriver(option);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.goibibo.com/");
	  
	  //close the popup
	  driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
	  
	  driver.findElement(By.xpath("//span[text()='Departure']")).click();
	  
	  
	  //expectation
	  String edate="6";
	  String emonth="April";
	  String eyear="2026";
	  
	  //select month
	  while(true)
	  {
		  String monthyear=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
	  
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
		  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	  }
	  
	  
	  }
	  
	  	  
	  //select date
	  
	  //List<WebElement> allDates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Week']//div[@class='DayPicker-Day']//div[@class='dateInnerCell']//p[1]"));
	  List<WebElement> allDates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div//div//div//p[1]"));
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
