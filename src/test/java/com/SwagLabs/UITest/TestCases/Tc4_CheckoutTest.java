package com.SwagLabs.UITest.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.UITest.Base.BaseClass;

public class Tc4_CheckoutTest extends BaseClass 
{
	//prerequisite
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		addWait();
		ip.addProductIntoCart(prop.getData("product1"));
		addWait();
		cp=ip.launchCartPage();
		addWait();
		checkout=cp.clickOnCheckoutButton();
	}
  @Test(priority=1)
  public void validateCheckoutWithoutData()
  {
	  String errorMsg=checkout.withoutDataClickContinue();
	  if(errorMsg.startsWith("Error"))
	  {
		  System.out.println("Error: "+errorMsg);
		  checkout.fillData(prop.getData("fn"),prop.getData("ln"),prop.getData("zp"));
	  }
  }
  
  

  @Test(priority=2)
  public void validateCancelProcess()
  {
	  cp=checkout.clickCancelButton();
	  int count=cp.getTotalCartProductCount();
	  System.out.println("Total products are: "+count);
	 checkout=cp.clickOnCheckoutButton();
	  
  }
  

  @Test(priority=3)
  public void validateCheckoutWithData()
  {
	  checkout.fillDataAndContinue(prop.getData("fn"),prop.getData("ln"),prop.getData("zp"));
	  Assert.assertTrue(lp.getAppUrl().contains("checkout-step-two"));
	  System.out.println("User navigated to Overview Page");
  }
  
  
  
}
