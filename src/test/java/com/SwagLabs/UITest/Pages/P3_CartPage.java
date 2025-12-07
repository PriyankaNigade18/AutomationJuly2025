package com.SwagLabs.UITest.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P3_CartPage {

	private WebDriver driver;
	
	public P3_CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locator
	@FindBy(xpath="//div[@class='cart_list']//div[@class='inventory_item_name']")
	private List<WebElement> totalCartIteams;
	
	@FindBy(xpath="//button[text()='Remove']")
	private WebElement removeButton;
	
	@FindBy(id="continue-shopping")
	private WebElement continueButton;
	
	@FindBy(id="checkout")
	private WebElement checkoutButton;
	
	//actions
	public int getTotalCartProductCount()
	{
		return totalCartIteams.size();
	}
	
	public P3_CartPage clickOnRemoveButton(String removepname)
	{
		for(WebElement i:totalCartIteams)
		{
			if(i.getText().contains(removepname))
			{
				removeButton.click();
				break;
			}
		}
		
		System.out.println("Product Removed:  "+removepname);
		return this;
		
	}
	
	public P2_InventoryPage doContinueShopping()
	{
		continueButton.click();
		//navigation to inventory page
		return new P2_InventoryPage(driver);
	}
	
	
	public P4_CheckoutPage clickOnCheckoutButton()
	{
		checkoutButton.click();
		return new P4_CheckoutPage(driver);
	}
	
	
	
	
	
}
