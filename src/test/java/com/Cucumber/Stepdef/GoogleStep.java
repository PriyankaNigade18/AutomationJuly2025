package com.Cucumber.Stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStep
{
	public WebDriver driver;
	String appTitle;
	
	@Given("Open Google application")
	public void open_google_application() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	    
	}

	@When("User get the current title of the google")
	public void user_get_the_current_title_of_the_google() {
	    appTitle=driver.getTitle();
	    System.out.println("Title is: "+appTitle);
	}

	@Then("Title should match")
	public void title_should_match()
	{
	    Assert.assertEquals(appTitle,"Google","Title not matched...");
	    System.out.println("Application Title matched....");
	}

	@When("User entervalid keyword in search")
	public void user_entervalid_keyword_in_search() throws InterruptedException {
	    driver.findElement(By.id("APjFqb")).sendKeys("Jenkins");
	    Thread.sleep(1000);
	    
	}

	@Then("It should display valid search Result")
	public void it_should_display_valid_search_result()
	{
	    List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li"));
	    for(WebElement i:allOptions)
	    {
	    	System.out.println(i.getText());
	    }
	    
	}


}
