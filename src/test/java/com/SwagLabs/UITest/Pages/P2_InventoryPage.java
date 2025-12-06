package com.SwagLabs.UITest.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_InventoryPage 
{
	private WebDriver driver;
	
	public P2_InventoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//locators
	@FindBy(xpath="//div[@class='inventory_item']")
	List<WebElement> totalProduct;//6
	
	@FindBy(xpath="//div[@class='inventory_item']//div[@class='inventory_item_name ']")
	List<WebElement> productName;//6
	
	@FindBy(id="add-to-cart")
	WebElement addToCartButton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartIcon;
	
	//actions
	public int getProductsCount() 
	{
		return totalProduct.size();
	}
	
	
	public P2_InventoryPage getProductDetails()
	{
		System.out.println("-----Product Names-----");
		
		for(WebElement i:productName)
		{
			System.out.println(i.getText());
		}
		return this;
	}
	
	public P2_InventoryPage addProductIntoCart(String pname)
	{
		for(WebElement i:productName)
		{
			if(i.getText().contains(pname))
			{
				//open product for more	details
				i.click();
				break;
				
			}
		}
		System.out.println("Product Found..."+pname);
		//add it to cart
		addToCartButton.click();
		
		System.out.println("Product added to cart..."+pname);
		return this;
	}
	
	public P3_CartPage launchCartPage()
	{
		cartIcon.click();
		//navigating to cart page
		return new P3_CartPage(driver);
	}
	
	
	
	
	
}
