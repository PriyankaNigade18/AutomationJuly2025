package com.SwagLab.Steps;

import org.testng.Assert;

import com.SwagLab.Pages.InventoryPage;
import com.SwagLab.Pages.LoginPage;
import com.SwagLab.Utility.BrowserProvider;

import io.cucumber.java.en.*;

public class InventoryPageSteps {

	LoginPage lp=new LoginPage(BrowserProvider.getDriver());
	InventoryPage ip;
	int count;

@Given("User should be login with valid credentials")
public void user_should_be_login_with_valid_credentials() {
   
	BrowserProvider.getDriver().get("https://www.saucedemo.com/");
	ip=lp.doLogin("standard_user","secret_sauce");
}

@Given("User should be on Inventory page")
public void user_should_be_on_inventory_page() {
    Assert.assertTrue(lp.getAppUrl().contains("inventory"));
    System.out.println("User is on Inventory page!");
}

@When("user get total product count")
public void user_get_total_product_count() {

	count=ip.getProductCount();
}

@Then("Product count should be {int}")
public void product_count_should_be(int expCount) {
   
	Assert.assertEquals(count,expCount);
	System.out.println("Product count matched...Total Products are"+count);
}

@When("User get product details")
public void user_get_product_details() {
    
	ip.getProductDetails();
}

@Then("product details should be display")
public void product_details_should_be_display() {

	System.out.println("Product details  displayed......");
}

@When("User add {string} product into Cart")
public void user_add_product_into_cart(String pname) {
    
	ip=ip.addProductIntoCart(pname);
}

@Then("Product should be added into cart")
public void product_should_be_added_into_cart() {
  
	ip.launchCartPage();
}

}
