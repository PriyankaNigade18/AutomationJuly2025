package com.SwagLabs.UITest.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.UITest.Base.BaseClass;

public class Tc3_CartTest extends BaseClass
{
	//prerequisite:user should be login and product should be there in cart page
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		addWait();
		ip.addProductIntoCart(prop.getData("product1"));
		addWait();
		cp=ip.launchCartPage();
	}
	
	
  @Test(priority=1)
  public void verifyCartProductCount()
  {
	  int count=cp.getTotalCartProductCount();
	  System.out.println("Total Products added in cart: "+count);
  }
  
  @Test(priority=2)
  public void validateProductRemoveFeature()
  {
	  cp.clickOnRemoveButton(prop.getData("product1"));
  }
  
  
  @Test(priority=3)
  public void validateContinueShopping()
  {
	  ip=cp.doContinueShopping();
	  ip.addProductIntoCart(prop.getData("product2"));
	  cp=ip.launchCartPage();
  }
  
  @Test(priority=4)
  public void validateCheckoutOption()
  {
	  cp.clickOnCheckoutButton();
	  Assert.assertTrue(lp.getAppUrl().contains("checkout"));
	  System.out.println("User Navigated to check page");
  }
}
