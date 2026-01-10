package com.Cucumber.Stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
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

	@When("user enter required username and password")
	public void user_enter_required_username_and_password(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		List<List<String>> data=dataTable.cells();
		driver.findElement(By.cssSelector("#user-name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.cssSelector("#password")).sendKeys(data.get(0).get(1));
		
		
		
		
		
		
		
	}



}
