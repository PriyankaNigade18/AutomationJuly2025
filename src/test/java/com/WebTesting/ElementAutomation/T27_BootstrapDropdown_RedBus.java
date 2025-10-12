package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T27_BootstrapDropdown_RedBus {
  @Test
  public void testDropdown() throws InterruptedException
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.redbus.in/");
	  
	  //from ele
	  driver.findElement(By.xpath("//div[text()='From']")).click();
	    
	  driver.findElement(By.id("srcDest")).sendKeys("pune");
	  
	  Thread.sleep(2000);
	  
	  List<WebElement> allOptions=driver.findElements(By.xpath("(//div)[1]//div[contains(@class,'listItem')]//div[contains(@class,'listHeader')]"));
	  System.out.println("Total options found: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Mumbai"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
  }
}
