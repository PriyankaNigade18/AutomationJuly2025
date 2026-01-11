package com.SwagLab.Steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.SwagLab.Pages.LoginPage;
import com.SwagLab.Utility.BrowserProvider;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps 
{
	//WebDriver driver=BrowserProvider.getDriver();
    LoginPage lp=new LoginPage(BrowserProvider.getDriver());
    String actTitle;
    
@Given("Open Application")
public void open_application() {
    
	BrowserProvider.getDriver().get("https://www.saucedemo.com/");
}

@When("I get the current page title")
public void i_get_the_current_page_title() 
{
  actTitle=lp.getAppTitle();
  
 }

@Then("Title should match")
public void title_should_match() {
 
	Assert.assertTrue(actTitle.contains("Labs"));
	System.out.println("Application Title is: "+actTitle);
}

@When("I enter {string} & {string}")
public void i_enter(String un, String psw) {
    lp.enterUserName(un);
    lp.enterPassword(psw);
}

@When("I click on Login button")
public void i_click_on_login_button()
{
    lp.clickLoginButton();
}

@Then("I should be navigated to inventory page")
public void i_should_be_navigated_to_inventory_page() {
    
	Assert.assertTrue(lp.getAppUrl().contains("inventory"));
	System.out.println("Login Completed!");
}

}
