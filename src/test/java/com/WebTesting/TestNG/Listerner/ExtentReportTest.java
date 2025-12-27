package com.WebTesting.TestNG.Listerner;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTest {
  @Test
  public void testReport()
  {
	  //create object of ExetentReports class
	  
	  ExtentReports extent=new ExtentReports();
	  
	  //path of report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//samplereport.html");
	  
	  //configuration
	  spark.config().setDocumentTitle("ExtentReport");
	  spark.config().setReportName("Test Sample Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attach report
	  extent.attachReporter(spark);
	  
	  //create test
	 ExtentTest test= extent.createTest("SampleTest");
	 
	 //create logs
	 test.log(Status.PASS,"Test Pass");
	 test.log(Status.INFO,"Test info");
	 test.log(Status.FAIL,"Test Fail");
	 test.log(Status.SKIP,"Test skip");
	 test.log(Status.WARNING,"Test warning");
	 
	 //close report
	 extent.flush();
	 
	  
  }
}
