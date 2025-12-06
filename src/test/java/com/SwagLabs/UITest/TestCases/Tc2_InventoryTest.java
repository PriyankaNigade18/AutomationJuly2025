package com.SwagLabs.UITest.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.UITest.Base.BaseClass;

public class Tc2_InventoryTest extends BaseClass
{
	//prerequisite: doLogin first
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin("standard_user","secret_sauce");
	}
	
  @Test(priority=1)
  public void validateProductCount() 
  {
	  int actCount=ip.getProductsCount();
	  int expCount=6;
	  Assert.assertEquals(actCount,expCount);
	  System.out.println("Total Products are: "+actCount);
  }
  
  @Test(priority=2)
  public void validateProductDetails() 
  {
	  ip.getProductDetails();
  }
  
  @Test(priority=3)
  public void validateAddToCartFeature() 
  {
	  ip.addProductIntoCart("Sauce Labs Bolt T-Shirt");
  }
  
  @Test(priority=4)
  public void validateCartPageLaunch()
  {
	  ip.launchCartPage();
	  Assert.assertTrue(lp.getAppUrl().contains("cart"));
	  System.out.println("User Navigated to cart Page....");
  }
}
