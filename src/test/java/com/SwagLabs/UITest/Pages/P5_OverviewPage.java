package com.SwagLabs.UITest.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P5_OverviewPage 
{
private WebDriver driver;

	public P5_OverviewPage (WebDriver dirver)
	{
		this.driver=driver;
		PageFactory.initElements(dirver,this);
		
	}
	
	@FindBy(xpath="//div[@class='summary_info']//div[contains(@class,'summary')]")
	private List<WebElement> paymentDetails;
	
	@FindBy(id="finish")
	private WebElement finishButton;
	
	@FindBy(tagName="h2")
	private WebElement successMessage;
	
	
	public P5_OverviewPage getPaymentDetails()
	{
		for(WebElement i:paymentDetails)
		{
			System.out.println(i.getText());
		}
		return this;
	}
	
	
	
	
	public String clickOnFinish()
	{
		finishButton.click();
		return successMessage.getText();
	}
}
