package com.SwagLabs.UITest.Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.SwagLabs.UITest.Pages.*;
import com.SwagLabs.UITest.Utility.BrowserProvider;
import com.SwagLabs.UITest.Utility.ExcelUtil;
import com.SwagLabs.UITest.Utility.PropertiesUtil;
import com.aventstack.chaintest.plugins.ChainTestListener;
public class BaseClass 
{
	public WebDriver driver;
	public P1_LoginPage lp;
	public P2_InventoryPage ip;
	public P3_CartPage cp;
	public P4_CheckoutPage checkout;
	public P5_OverviewPage overview;
	
	public PropertiesUtil prop;
	
	//@BeforTest: use xml :1Beforetest.xml format to run suite
	@BeforeClass
	@Parameters({"bname"})
	public void  setUp(String bname)
	{
//		switch(bname)
//		{
//		case "edge":driver=new EdgeDriver(); break;
//		case "chrome":driver=new ChromeDriver(); break;
//		case "firefox":driver=new FirefoxDriver(); break;
//		default:System.out.println("Wrong Browser "+bname+" I will start with default edge browser");
//		driver=new EdgeDriver();
//		}
		ChainTestListener.log("Driver session started.....");
		prop=new PropertiesUtil();
		driver=BrowserProvider.setDriver(bname);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get(prop.getData("url"));
		driver.get(ExcelUtil.getData("AppData",3,1));
		lp=new P1_LoginPage(driver);
		ip=new P2_InventoryPage(driver);
		cp=new P3_CartPage(driver);
		checkout=new P4_CheckoutPage(driver);
		overview=new P5_OverviewPage(driver);
		
		
	}
	
	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void testWait()
	{
		addWait();
		
	}
	@AfterMethod
	public void getScreenshot(ITestResult result)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//report 
		byte arr[]=ts.getScreenshotAs(OutputType.BYTES);
		ChainTestListener.embed(arr,"image/png");
		
		//local
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//Screenshots//"+result.getName()+".png");
		
		try {
			FileHandler.copy(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void tearDown()
	{
		ChainTestListener.log("Session closed!");
		driver.quit();
	}

}
