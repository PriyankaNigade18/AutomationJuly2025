package com.WebTesting.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T19_RealAmazonSearchScenario {

	public static void main(String[] args) throws InterruptedException
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		
		Thread.sleep(2000);
		
		List<WebElement> allOptions=driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[contains(@id,'sac-suggestion-row') and @class='s-suggestion-container']"));

		System.out.println("Total options are: "+allOptions.size());
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
	}

}
