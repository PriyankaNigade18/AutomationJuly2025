package com.Programming.OOP.DataAbstrcation;

public class HDFC implements RBIBank
{
	
	public void custDetails()
	{
		System.out.println("HDFC.....CustomerData()");
	}

	@Override
	public void withdraw() {

		System.out.println("HDFC.....withdraw()");
		
	}

	@Override
	public void deposit() {
		System.out.println("HDFC.....deposit()");

		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC.....rateOfInterest 9%");

		
	}

}
