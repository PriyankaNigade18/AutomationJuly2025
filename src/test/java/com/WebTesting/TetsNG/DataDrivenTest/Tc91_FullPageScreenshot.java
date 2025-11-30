package com.WebTesting.TetsNG.DataDrivenTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Tc91_FullPageScreenshot {
  @Test
  public void testFullPage() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	  
	  
	  
	  Screenshot scr=new AShot()
	  .shootingStrategy(ShootingStrategies.viewportPasting(100))
	  .takeScreenshot(driver);
	  File dest=new File(System.getProperty("user.dir")+"//Screenshots//AmazonFullPage"+timestamp+".png");

	  
	  try {
		ImageIO.write(scr.getImage(),"PNG",dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
