package com.Programming.OOP.Encapsulation;

public class AccountcheckTest {

	public static void main(String[] args) 
	{

		AccountCheck ac=new AccountCheck();
		ac.setAmount(2000);
		int amount=ac.getAmount();
		System.out.println("Total balance is: "+amount);

		System.out.println("-------------------");
		AccountCheck ac2=new AccountCheck();
		ac2.setAmount(700);
		int balance=ac2.getAmount();
		System.out.println("Total balance is: "+balance);
	}
	

}
