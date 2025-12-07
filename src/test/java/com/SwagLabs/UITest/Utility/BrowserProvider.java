package com.SwagLabs.UITest.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserProvider
{
	
	/*
	 * ThreadLocal class from java help us to create common/one thread
	 * that we can use in entire project
	 * get()
	 * set()
	 */
	
	static public WebDriver driver;
	
	
	static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return tdriver.get();
	}
	
	public static WebDriver setDriver(String bname)
	{
		switch(bname)
		{
		case "edge":
			driver=new EdgeDriver();
			tdriver.set(driver);
			break;
		case "chrome":driver=new ChromeDriver();
			tdriver.set(driver);
			break;
		case "firefox":driver=new FirefoxDriver();
			tdriver.set(driver);
			break;
		default:
			System.out.println("Wrong Browser "+bname+" I will start with default edge browser");
			driver=new EdgeDriver();
			tdriver.set(driver);
		}
		
		return tdriver.get();
	}
	
	
	
	
	
	
	
	
	
	

}
