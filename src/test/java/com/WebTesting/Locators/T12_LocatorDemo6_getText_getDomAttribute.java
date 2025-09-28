package com.WebTesting.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T12_LocatorDemo6_getText_getDomAttribute {

	public static void main(String[] args) 
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: "+allLinks.size());
		
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getDomAttribute("href"));
			System.out.println(i.getText());
			
		}
		
		
		/*Scenario:
		 * Get the total links and get href attribute value and print text of every link
		 * 
		 */
		/*
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: "+allLinks.size());//5
		
		String expLink="https://www.youtube.com/c/OrangeHRMInc";
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getDomAttribute("href"));
			System.out.println(i.getText());
			if(i.getDomAttribute("href").contains(expLink))
			{
				i.click();
				System.out.println("Link found...Test pass");
				break;
			}
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
