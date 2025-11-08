package com.WebTesting.ElementAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T52_FileUploadUsingRobotClass {
  @Test
  public void testFileUpload() throws AWTException, InterruptedException 
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //click on Choose file
	  //driver.findElement(By.xpath("//input[@id='file-upload']")).click();
	  
	  WebElement ele=driver.findElement(By.xpath("//input[@id='file-upload']"));
//	  JavascriptExecutor js=(JavascriptExecutor) driver;
//	  js.executeScript("document.getElementById('file-upload').click()",ele);
	  
	  //Actions class from selenium
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).click().build().perform();
	  
	  //file Explorer is windows feature:Robot class
	  
	  Robot rb=new Robot();
	  rb.delay(4000);
	  
	  //copy file(Clipboard action: Ctrl+c)
	  StringSelection sc=new StringSelection("C:\\Users\\piyun\\OneDrive\\Desktop\\Appiumsetup.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	  
	  //paste file(ctrl+v): vk virtual keyboard
	  //press key
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  
	  //release
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V);
	  
	  
	  //open: click on button enter 
	  rb.keyPress(KeyEvent.VK_ENTER);
	  
	  //file upload
	  driver.findElement(By.id("file-submit")).click();
	  
	  Thread.sleep(2000);
	  
	  /*assertion
	  String actText=driver.findElement(By.tagName("h3")).getText();
	  String expText="File Uploaded!";
	  
	  if(actText.equals(expText))
	  {
		  System.out.println("Test pass....File uploaded!");
	  }else
	  {
		  System.out.println("Test Fail......File not Uploaded");
	  }
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
