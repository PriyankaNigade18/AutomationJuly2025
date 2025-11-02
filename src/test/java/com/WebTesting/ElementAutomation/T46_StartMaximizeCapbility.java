package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class T46_StartMaximizeCapbility {
  @Test
  public void testMaximizedApp() throws InterruptedException
  {
	  ChromeOptions options = new ChromeOptions();
	  	options.addArguments("start-maximized");
	  
	// Create driver session
			WebDriver driver=new ChromeDriver(options);
			System.out.println("Driver session created.....");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com");
			System.out.println("App open......");
			//driver.manage().window().maximize();
			
			
			//searchbox
			driver.findElement(By.id("APjFqb")).sendKeys("Java");
			System.out.println("Search with keyword......");
			
			List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
			System.out.println("Total options are: "+allOptions.size());//10
			
			for(WebElement i:allOptions)
			{
				System.out.println(i.getText());
			}
			
			
			Thread.sleep(2000);
			driver.quit();
			System.out.println("Browser closed!");
  }
}
