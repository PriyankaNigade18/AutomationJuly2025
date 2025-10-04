package com.WebTesting.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T18_RealGoogleSearchScenario {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		//searchbox
		driver.findElement(By.id("APjFqb")).sendKeys("Java");
		
		List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println("Total options are: "+allOptions.size());//10
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
