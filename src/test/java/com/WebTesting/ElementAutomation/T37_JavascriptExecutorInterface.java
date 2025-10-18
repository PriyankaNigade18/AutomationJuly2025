package com.WebTesting.ElementAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.Utility;

public class T37_JavascriptExecutorInterface {
  @Test
  public void testJavascriptExecutorInterface() throws InterruptedException 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  //get the title
	  System.out.println("App Title: "+driver.getTitle());
	  
	  //using javascriptExecutor get the title
	  //convert driver object into JavascriptExecutor object
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  String appTitle=js.executeScript("return document.title").toString();
	  System.out.println("App Title: "+appTitle);
	  
	  
	  Thread.sleep(2000);
	  //driver.navigate().refresh();
	  
	  //using javascriptExecutor refresh the page
	   js.executeScript("history.go()");
	  
	   
	   //scroll down
	   Utility.scrollDown(driver);
	   
	   Thread.sleep(2000);
	   
	   //scroll up
	   Utility.scrollUp(driver);
	   
	   Thread.sleep(2000);
	   //scroll up to element
	   WebElement ele=driver.findElement(By.xpath("(//span[contains(text(),'Kitchen essentials')])[5]"));
	   Utility.scrollUptoEelement(driver,ele);
	   
	   Thread.sleep(2000);
	   
	   Utility.scrollUp(driver);
	   
	   //click on element
	   WebElement linkEle=driver.findElement(By.linkText("Mobiles"));
	   js.executeScript("arguments[0].click();",linkEle);
	   
	   //enter into inputbox
	   WebElement searchEle=driver.findElement(By.id("twotabsearchtextbox"));
	   js.executeScript("arguments[0].value='watch';",searchEle);
	   
	   
	   
	   /*
	   //scroll down
	  // js.executeScript("window.scrollTo(0,3000)");
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	   
	   Thread.sleep(2000);
	   
	   //scroll up
	   js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	   
	   
	   Thread.sleep(2000);
	   
	   //scroll upto specific element
	   WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Beauty & makeup')]"));
	   js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  */
	  
	  
	  
	  
  }
}
