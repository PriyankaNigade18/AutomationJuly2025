package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T1_FirstBrowserTest {

	public static void main(String[] args)
	{
		//SearchContext(I)--->WebDriver(I)--->RemoteWebDriver(C)-->Browser specific classes

		//SearchContext driver1=new ChromeDriver();
//		driver1.findElement(null);
//		driver1.findElements(null);
		
		//ChromeOptions option=new ChromeOptions(); 
//		SearchContext driver2=new RemoteWebDriver(option);
	
	//	RemoteWebDriver driver2=new RemoteWebDriver(option);
		
		//create driver session with chrome
		WebDriver driver1=new ChromeDriver();
		
		//create driver session with firefox
		WebDriver driver2=new FirefoxDriver();
		
		//create driver session with edge
		WebDriver driver3=new EdgeDriver();
		
		
		
		
		
		
		
		
	}

}
