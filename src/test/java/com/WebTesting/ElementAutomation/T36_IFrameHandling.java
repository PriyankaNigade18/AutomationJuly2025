package com.WebTesting.ElementAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T36_IFrameHandling {
  @Test
  public void testFrame()
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  //frame1-ele:frame with indexing
	 // driver.switchTo().frame(0);
	  
	  //frame with id/name
	  //driver.switchTo().frame("id/name");
	  
	  //frame with WebElement
	  WebElement frameEle=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	  driver.switchTo().frame(frameEle);
	  
	  driver.findElement(By.name("mytext1")).sendKeys("frame1 element");
	  
	  
	  //to navigate main page
	  driver.switchTo().defaultContent();
	  
	  //ele2:frame2
	  driver.switchTo().frame(1);
	  driver.findElement(By.name("mytext2")).sendKeys("frame2 element");
	  
	  //to navigate main page
	  driver.switchTo().defaultContent();
	  
	  //ele3:frame3
	  driver.switchTo().frame(2);
	  WebElement ele3=driver.findElement(By.name("mytext3"));
	  ele3.sendKeys("frame3 element");
	  
	  //inner frame which is part of frame3
	  WebElement innerFrame=driver.findElement(By.tagName("iframe"));
	  driver.switchTo().frame(innerFrame);
	  
	  //click on radio button
	  driver.findElement(By.id("i9")).click();
	  
	  //come to parent frame
	  driver.switchTo().parentFrame();
	  
	  //come to parent frame and clear the previuos text and write new text
	  ele3.clear();
	  ele3.sendKeys("Bye all!");
	  
	  
	  
  }
}
