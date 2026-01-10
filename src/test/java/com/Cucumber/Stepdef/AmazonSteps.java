package com.Cucumber.Stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AmazonSteps 
{

	WebDriver driver;
	String appTitle;
	
@Given("Open Amazon application")
public void open_amazon_application() {
    driver=new EdgeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
}

@When("User get the home page title")
public void user_get_the_home_page_title() {
    appTitle=driver.getTitle();
    System.out.println("Home page title is: "+appTitle);
}

@Then("title should match with home page")
public void title_should_match_with_home_page() {
   
	Assert.assertTrue(appTitle.contains("site in India"));
	System.out.println("Home page title matched!");
}

@When("User open Sell page")
public void user_open_sell_page() {
	driver.findElement(By.linkText("Sell")).click();
	
}

@When("User get the sell page title")
public void user_get_the_sell_page_title() {
	
	appTitle=driver.getTitle();
	System.out.println("Sell page Title: "+appTitle);
}

@Then("title should match with Sell page")
public void title_should_match_with_sell_page() {
	Assert.assertTrue(appTitle.contains("All Categories"));
	System.out.println("Sell page title matched!");
}

@When("User open mobile page")
public void user_open_mobile_page() {
   driver.findElement(By.linkText("Mobiles")).click();
}

@When("User get the mobile page title")
public void user_get_the_mobile_page_title() {

	appTitle=driver.getTitle();
	System.out.println("Mobile page title: "+appTitle);
}

@Then("title should match with Mobile page")
public void title_should_match_with_mobile_page() {
	Assert.assertTrue(appTitle.contains("Phones Online"));
	System.out.println("Mobile page title matched!");
}

@When("User open Fashion page")
public void user_open_fashion_page() {
   driver.findElement(By.linkText("Fashion")).click();
}

@When("User get the Fashion page title")
public void user_get_the_fashion_page_title() {
   appTitle=driver.getTitle();
   System.out.println("Fashion page title: "+appTitle);
}

@Then("title should match with Fashion page")
public void title_should_match_with_fashion_page() {
	Assert.assertTrue(appTitle.contains("Fashion Store"));
	System.out.println("Fashion page title matched!");
}



}
