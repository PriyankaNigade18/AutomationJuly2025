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

public class T25_SelectBaseDropdownAutomation_Amazon {
  @Test
  public void testAmazonDropdown() throws InterruptedException 
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  //get the address of dropdown
	  WebElement ddEle=driver.findElement(By.id("searchDropdownBox"));
	  
	  Utility.selectBasedDropdown(ddEle,"MP3 Music");
	  
	  
	  
	  
	  /*
	  //create Select class object
	  Select dd=new Select(ddEle);
	  System.out.println("Is dropdown support multiple selection: "+dd.isMultiple());
	  
	  //single selection
	  dd.selectByIndex(3);
	  Thread.sleep(1500);
	  dd.selectByVisibleText("Sports, Fitness & Outdoors");
	  Thread.sleep(1500);
	  dd.selectByValue("search-alias=videogames");
	  
	  //get the all options
	  List<WebElement> allOptions=dd.getOptions();
	  System.out.println("Total options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Books"))
		  {
			  System.out.println("Option found!");
			  i.click();
			  break;
		  }
	  }
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
