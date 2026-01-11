package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
private WebDriver driver;

public InventoryPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}

//locators
@FindBy(xpath="//div[@class='inventory_item_name ']")
private List<WebElement> allProducts;

@FindBy(xpath="//button[text()='Add to cart']")
private WebElement addToCartBtn;
	
@FindBy(xpath="//a[@class='shopping_cart_link']")
private WebElement cartIcon;



//methods
public int getProductCount()
{
 return allProducts.size();
	
}

public void getProductDetails()
{
	for(WebElement i:allProducts)
	{
		System.out.println(i.getText());
	}
}
	
	
public InventoryPage addProductIntoCart(String pname)
{
	for(WebElement i:allProducts)
	{
		if(i.getText().contains(pname))
		{
			i.click();
			break;
		}
		
	}
	
	//click on button
	addToCartBtn.click();
	System.out.println("Product "+pname+" added into cart");
return this;
}


public void launchCartPage()
{
	cartIcon.click();
	//navigation next page cart
}
}