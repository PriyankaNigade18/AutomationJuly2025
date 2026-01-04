package com.Cucumber.Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwaglabsSteps {

	WebDriver driver;
	
	@Given("Open Application with url {string}")
	public void open_application_with_url(String url) {
	    driver=new ChromeDriver();
	    driver.get(url);
	}

	@When("User enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String un, String pwd) {
	    
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("User click on swaglab Login button")
	public void user_click_on_swaglab_login_button() {
	   driver.findElement(By.id("login-button")).click();
	}

	@Then("login should complete and user should nvaigate to inventory page")
	public void login_should_complete_and_user_should_nvaigate_to_inventory_page() {
		
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"Login Failed!");
		System.out.println("Login Completed!");
	}



}
