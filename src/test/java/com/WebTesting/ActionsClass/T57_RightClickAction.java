package com.WebTesting.ActionsClass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T57_RightClickAction {
  @Test
  public void testRightclick() throws InterruptedException
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");

	  WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
  
	  Actions act=new Actions(driver);
	  act.contextClick(button).perform();
	  
	  //menu
	  List<WebElement> allOptions=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Delete"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  Thread.sleep(2000);
  
	  //alert
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert text: "+alt.getText());
	  //ok
	  alt.accept();
	  
	  
  
  }
}
