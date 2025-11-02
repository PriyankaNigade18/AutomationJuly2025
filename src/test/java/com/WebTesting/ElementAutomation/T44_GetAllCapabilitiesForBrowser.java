package com.WebTesting.ElementAutomation;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class T44_GetAllCapabilitiesForBrowser {
  @Test
  public void testCapabilities()
  {
	  
	  //get capabilities for chrome
	  ChromeDriver driver1=new ChromeDriver();
	  Capabilities cap1=driver1.getCapabilities();
	  Map<String,Object> allCap=cap1.asMap();
	  System.out.println(allCap);
	  
	  /*
	   * {acceptInsecureCerts=false, 
	   * browserName=chrome,
	   *  browserVersion=141.0.7390.123,
	   *   chrome={chromedriverVersion=141.0.7390.122 (b477534e7e10d193e916cd4e2967c589383625b2-refs/branch-heads/7390@{#2667}),
	   *    userDataDir=C:\Users\piyun\AppData\Local\Temp\scoped_dir25352_851581575},
	   *     fedcm:accounts=true, goog:chromeOptions={debuggerAddress=localhost:52762}, 
	   *     networkConnectionEnabled=false,
	   *      pageLoadStrategy=normal,
	   *      platformName=windows, 
	   *      proxy=Proxy(), 
	   *      se:cdp=ws://localhost:52762/devtools/browser/bb261178-b0c4-43c0-8f44-e06008775b1c, se:cdpVersion=141.0.7390.123,
	   *       setWindowRect=true, strictFileInteractability=false, 
	   *       timeouts={implicit=0, pageLoad=300000, script=30000}, 
	   *       unhandledPromptBehavior=dismiss and notify, webauthn:extension:credBlob=true,
	   *        webauthn:extension:largeBlob=true, webauthn:extension:minPinLength=true, 
	   *        webauthn:extension:prf=true,
	   *         webauthn:virtualAuthenticators=true}
	   */
	  
	  
	  
	  //get the capabilities for firefox
	  FirefoxDriver driver2=new FirefoxDriver();
	  Capabilities cap2=driver2.getCapabilities();
	  Map<String,Object> allCap2=cap2.asMap();
	  System.out.println(allCap2);
	  
	  //get the capabilities for Edge
	 EdgeDriver driver3=new EdgeDriver();
	  Capabilities cap3=driver3.getCapabilities();
	  Map<String,Object> allCap3=cap3.asMap();
	  System.out.println(allCap3);
	  
	  
	  
	  
  }
}
