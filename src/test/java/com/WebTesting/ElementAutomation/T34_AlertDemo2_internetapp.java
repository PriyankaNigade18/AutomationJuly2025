package com.WebTesting.ElementAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T34_AlertDemo2_internetapp {
  @Test
  public void testAlert() throws InterruptedException 
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  
	  //alert1:simple alert
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	  Thread.sleep(1500);
	  //alert will open
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert1 text is: "+alt1.getText());
	  //ok
	  alt1.accept();
	  
	  //Result
	  WebElement resultText=driver.findElement(By.id("result"));
	  System.out.println("Result text is: "+resultText.getText());
	  
	  //alert2: confirmation 
	  driver.findElement(By.xpath("(//button)[2]")).click();
	  
	  //alert will open 
	  Thread.sleep(1500);
	  
	  //handle
	 Alert alt2= driver.switchTo().alert();
	 System.out.println("Alert2 text is: "+alt2.getText());
	 //cancel:dismiss()
	 alt2.dismiss();
	 System.out.println("Result text is: "+resultText.getText());
	 
	 //alert3:prompt alert
	 
	 driver.findElement(By.xpath("(//button)[3]")).click();
	 
	 //alert will open
	 Thread.sleep(1500);
	 
	 //handle
	 Alert alt3=driver.switchTo().alert();
	 System.out.println("Alert3 text is: "+alt3.getText());
	 //prompt:sendKeys()
	 alt3.sendKeys("Hello All");
	 //ok
	 alt3.accept();
	 
	 System.out.println("Result text is: "+resultText.getText());

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
