package com.WebTesting.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T59_MouseOverTest {
  @Test
  public void testMouseOver() throws InterruptedException 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  //mobiles page
	  driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	  	  
	  //mouse over
	  WebElement ele=driver.findElement(By.xpath("(//span[normalize-space()='Mobiles & Accessories'])[2]"));	  
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  
	  Thread.sleep(2000);
	  
	  String text=driver.findElement(By.xpath("//ul[@class='mm-category-list']//a[text()='Honor']")).getText();
	  System.out.println(text);
			  
	  
  }
}
