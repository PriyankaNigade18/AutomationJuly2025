package com.SwagLabs.UITest.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.SwagLabs.UITest.Pages.*;

public class BaseClass 
{
	public WebDriver driver;
	public P1_LoginPage lp;
	public P2_InventoryPage ip;
	
	
	//@BeforTest: use xml :1Beforetest.xml format to run suite
	@BeforeClass
	@Parameters({"bname"})
	public void  setUp(String bname)
	{
		switch(bname)
		{
		case "edge":driver=new EdgeDriver(); break;
		case "chrome":driver=new ChromeDriver(); break;
		case "firefox":driver=new FirefoxDriver(); break;
		default:System.out.println("Wrong Browser "+bname+" I will start with default edge browser");
		driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp=new P1_LoginPage(driver);
		ip=new P2_InventoryPage(driver);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
