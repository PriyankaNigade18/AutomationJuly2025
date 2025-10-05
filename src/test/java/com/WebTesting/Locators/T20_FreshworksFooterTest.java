package com.WebTesting.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T20_FreshworksFooterTest {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//nav[contains(@class,'fMAcTI')]/div/ul/li/a/span"));

		System.out.println("Total Footer links are: "+allLinks.size());
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
		}
	}

}
