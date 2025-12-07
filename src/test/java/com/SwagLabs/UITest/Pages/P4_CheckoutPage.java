package com.SwagLabs.UITest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P4_CheckoutPage {

	private WebDriver driver;
	
	 public P4_CheckoutPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	 }
	 
	 //locators
	 @FindBy(id="first-name")
	 private WebElement fname;
	 
	 @FindBy(id="last-name")
	 private WebElement lname;
	 
	 @FindBy(id="postal-code")
	 private WebElement postalCode;
	 	 
	 @FindBy(id="continue")
	 private WebElement continueButton;
	 
	 @FindBy(id="cancel")
	 private WebElement cancelButton;
	 
	 @FindBy(xpath="//h3[@data-test='error']")
	 private WebElement error;
	 
	 
	 //action
	 //+ve
	 public P5_OverviewPage fillDataAndContinue(String fn,String ln,String zp)
	 {
		 fname.sendKeys(fn);
		 lname.sendKeys(ln);
		 postalCode.sendKeys(zp);
		 continueButton.click();
		 return new P5_OverviewPage(driver);
	 }
	 
	 public P4_CheckoutPage fillData(String fn,String ln,String zp)
	 {
		 fname.sendKeys(fn);
		 lname.sendKeys(ln);
		 postalCode.sendKeys(zp);
		 return this;
	 }
	 
	 //-ve
	 public String withoutDataClickContinue()
	 {
		 continueButton.click();
		 
		 return error.getText();
	
		
	 }
	 
	 public P3_CartPage clickCancelButton()
	 {
		 cancelButton.click();
		 return new P3_CartPage(driver);
	 }
	 
	 
	 
	 
	 
}
