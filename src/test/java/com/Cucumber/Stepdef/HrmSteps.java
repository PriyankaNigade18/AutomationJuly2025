package com.Cucumber.Stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HrmSteps
{

	WebDriver driver;
	
	@Given("Open Orangehrm application")
	public void open_orangehrm_application() {
		
	   driver=new EdgeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	   
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String un, String psw) 
	{
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("user click on Hrm login button")
	public void user_click_on_hrm_login_button() throws InterruptedException {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(1000);
	}

	@Then("Valid user should be navigated to dashboard page")
	public void valid_user_should_be_navigated_to_dashboard_page() {

		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login fail!");
		System.out.println("Login Completed!");
		
	}

}
