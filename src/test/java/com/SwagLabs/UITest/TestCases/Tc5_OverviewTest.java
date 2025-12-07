package com.SwagLabs.UITest.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.UITest.Base.BaseClass;

public class Tc5_OverviewTest extends BaseClass
{
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
		addWait();
		overview=checkout.fillDataAndContinue(prop.getData("fn"),prop.getData("ln"),prop.getData("zp"));
		
	}
	
	
  @Test(priority=1)
  public void verifyPayment() 
  {
	  overview.getPaymentDetails();
	  
  }
  
  
  @Test(priority=2)
  public void validateCheckout() 
  {
	  String msg=overview.clickOnFinish();
	  Assert.assertEquals(msg,"Thank you for your order!");
	  System.out.println(msg);
	  System.out.println("Checkout process completed!");
  }
  
}
