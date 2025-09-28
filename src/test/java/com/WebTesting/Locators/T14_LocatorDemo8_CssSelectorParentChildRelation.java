package com.WebTesting.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T14_LocatorDemo8_CssSelectorParentChildRelation {

	public static void main(String[] args)
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		//direct single child element
		driver.findElement(By.cssSelector("div[class='list-group']>a:nth-child(3)")).click();
		/*
		//multiple elements
		List<WebElement> allOptions=driver.findElements(By.cssSelector("div[class='list-group']>a"));
		
		System.out.println("Total options are: "+allOptions.size());
		
		WebElement ele=null;
		for(WebElement i: allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Forgotten Password"))
			{
//				i.click();
//				break;
				ele=i;
			}
		}
		
		ele.click();
		
		*/
		
	}

}
