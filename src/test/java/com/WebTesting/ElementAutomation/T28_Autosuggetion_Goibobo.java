package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class T28_Autosuggetion_Goibobo {
  @Test
  public void testDropdown()
  {
	  //disable notifications
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.goibibo.com/flights");
	  driver.manage().window().maximize();
	  
	  //close the popup
	  driver.findElement(By.xpath(" //span[contains(@class,'icClose')]")).click();
	  
	  //from
	  driver.findElement(By.id("fromCity")).click();
	  
	  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("pune");
	  
List<WebElement> allOptions=driver.findElements(By.xpath("//ul//li//div//p[contains(@class,'blackText')]"));
	  
System.out.println("Total Options are: "+allOptions.size());

String exp="Pune, India";

for(WebElement i:allOptions)
{
	System.out.println(i.getText());
	if(i.getText().contains(exp))
	{
		i.click();
		break;
	}
}


	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
