package com.WebTesting.Wait;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T53_DefaultWaitInSelenium {
  @Test
  public void testWait() 
  {
	  
	  ChromeDriver driver=new ChromeDriver();
	  Capabilities cap=driver.getCapabilities();
	  Map<String,Object> allCap=cap.asMap();
	  System.out.println(allCap);
	  /*
	   *{acceptInsecureCerts=false, browserName=chrome,
	   * browserVersion=142.0.7444.134,
	   *  chrome={chromedriverVersion=142.0.7444.61 (9884f628acbc5ba8787e2c95a8923a30cf127fd8-refs/branch-heads/7444_52@{#6}), userDataDir=C:\Users\piyun\AppData\Local\Temp\scoped_dir23356_1947775937},
	   *   fedcm:accounts=true, goog:chromeOptions={debuggerAddress=localhost:63283}, 
	   *   goog:processID=20112, 
	   *   networkConnectionEnabled=false, 
	   *   pageLoadStrategy=normal, platformName=windows,
	   *    proxy=Proxy(), se:cdp=ws://localhost:63283/devtools/browser/30c9a687-e46a-424a-a2da-7086cffc0722, se:cdpVersion=142.0.7444.134, 
	   *    setWindowRect=true, 
	   *    strictFileInteractability=false,
	   *     timeouts={implicit=0, pageLoad=300000, script=30000},
	   *      unhandledPromptBehavior=dismiss and notify, 
	   *      webauthn:extension:credBlob=true, webauthn:extension:largeBlob=true,
	   *       webauthn:extension:minPinLength=true, 
	   *webauthn:extension:prf=true,
	   * webauthn:virtualAuthenticators=true} 
	   */
	  
  }
}
