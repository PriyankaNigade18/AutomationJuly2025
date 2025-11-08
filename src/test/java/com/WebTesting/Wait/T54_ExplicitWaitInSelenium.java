package com.WebTesting.Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.WebTesting.Generic.Utility;

public class T54_ExplicitWaitInSelenium {
  @Test
  public void testWait() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //by locator
	  By emailLoc=By.id("input-email");	  
	  By passLoc=By.id("input-password");
	  By loginLoc=By.xpath("//input[@value='Login']");
	  
	  
	  WebElement emailEle=Utility.waitForElementPresence(driver,emailLoc);
	  emailEle.sendKeys("test@gmail.com");
	  
	 WebElement passEle=Utility.waitForElementVisibility(driver,passLoc);
	 passEle.sendKeys("test123");
	 
	 Utility.waitForElementClick(driver,loginLoc).click();
	  
	  //explicit wait: applicable for single webelement
	  /*
	   * TimeoutException:
	   *  Expected condition failed: waiting for presence of element 
	   *  located by: By.id: input-email#### 
	   *  (tried for 5 second(s) with 500 milliseconds interval)
	   *  interval time = Polling time=0.5sec
	   */
	  /*
	  //email ele
	  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement ele=wait1.until(ExpectedConditions.presenceOfElementLocated(emailLoc));
	  ele.sendKeys("test@gmail.com");
	  
	  //password ele
	  WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(passLoc)).sendKeys("test123");
	  
	  WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait3.until(ExpectedConditions.elementToBeClickable(loginLoc)).click();
	  */
	  
	  
	  
	  
	  
	  
	  
  }
}
