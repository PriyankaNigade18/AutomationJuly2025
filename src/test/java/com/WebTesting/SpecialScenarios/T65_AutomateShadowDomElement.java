package com.WebTesting.SpecialScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.Utility;

public class T65_AutomateShadowDomElement {
  @Test
  public void testShadowDomEle() throws InterruptedException
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");

	  WebElement ele=driver.findElement(By.xpath("//h2[text()='ShadowDOM']"));
	  Utility.scrollUptoEelement(driver,ele);
	  
	  
	  //main document-->host--->root--->ele
	  
	  //mobiles
	  //host
	  WebElement host1=driver.findElement(By.cssSelector("#shadow_host"));
	  //root
	  SearchContext root1=host1.getShadowRoot();
	  //ele
	  String text=root1.findElement(By.cssSelector("#shadow_content")).getText();
	  System.out.println(text);
	  
	  
	  //root1-->host2-->root2-->ele: Nested
	  
	  WebElement host2=root1.findElement(By.cssSelector("#nested_shadow_host"));
	  //root
	  SearchContext root2=host2.getShadowRoot();
	  //ele
	  String text2=root2.findElement(By.cssSelector("#nested_shadow_content")).getText();
	  
	  System.out.println(text2);
	  
	  
	  //root1 shadown dom ele
	 WebElement ele2=root1.findElement(By.cssSelector("a[href='https://www.pavantestingtools.com/']"));
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("arguments[0].click()",ele2);
	 
	 
	 Thread.sleep(2000);
	 driver.navigate().back();
	 
	  //input box is part of root1
	 root1.findElement(By.cssSelector("input[type='text']")).sendKeys("hello");
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
