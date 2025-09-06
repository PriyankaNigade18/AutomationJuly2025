package com.Programming.OOP.Encapsulation;

public class AccountCheck 
{
	//condition: account is activated only when amount is greater than 1000
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount)
	{
		if(amount>=1000)
		{
			System.out.println("Valid Amount....Account is activated!");
			this.amount=amount;
		}
		else
		{
			System.out.println("Insufficient amount ....Account not activated add more amount!");
			this.amount=amount;
		}
	}
	
	
	
	

}
