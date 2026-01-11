package com.Cucumber.Stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import com.Cucumber.Hooks.CRMHooks;
import com.Cucumber.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMSteps //extends CRMHooks
{
	WebDriver driver=BrowserProvider.getDriver();
	
	
//	@Before
//	public void setup()
//	{
//		System.out.println("Driver session started.....");
//		driver=new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//	
//	
//	@After
//	public void tearDown() throws InterruptedException
//	{
//		Thread.sleep(1500);
//		driver.quit();
//		System.out.println("Driver session closed!");
//	}
	
	

@Given("Open CRM application")
public void open_crm_application()
{
	
	driver.get("https://automationplayground.com/crm/");
    
}

@When("User click on SignIn link")
public void user_click_on_sign_in_link() {
    driver.findElement(By.linkText("Sign In")).click();
}

@Then("User should navigate to login page")
public void user_should_navigate_to_login_page() {
   Assert.assertTrue(driver.getCurrentUrl().contains("login"));
   System.out.println("User navigated to login page!");
   
}

@When("User enter valid {string} & valid {string}")
public void user_enter_valid_valid(String email, String pass) {
    driver.findElement(By.id("email-id")).sendKeys(email);
    driver.findElement(By.id("password")).sendKeys(pass);
}

@When("User click on crm Submit button")
public void user_click_on_crm_submit_button() throws InterruptedException {
   driver.findElement(By.id("submit-id")).click();
   Thread.sleep(1000);
}

@Then("User should navigate to customer page")
public void user_should_navigate_to_customer_page() {

	Assert.assertTrue(driver.getCurrentUrl().contains("customers"));
	System.out.println("User navigated to Customers page!");
}


}
