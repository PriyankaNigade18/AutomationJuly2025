package com.Programming.OOP.DataAbstrcation;

public class TestBank {

	public static void main(String[] args) 
	{
		//System.out.println("Scenario1: Parent ref and Parent object: Parent:Invalid");
		//Cannot instantiate the type RBIBank
		//RBIBank r1=new RBIBank();
		
		System.out.println("Scenario1: Child class ref and child class Object:Parent+child");
		
		HDFC h1=new HDFC();
		h1.custDetails();//individual
		h1.withdraw();//inherited abstract method
		h1.deposit();//inherited abstract method
		h1.rateOfInterest();//inherited abstract method
		
		System.out.println("Scenario2: Parent class ref and child class Object:Parent");
		
		RBIBank r1=new HDFC();
		r1.withdraw();//individual
		r1.deposit();//individual
		r1.rateOfInterest();//individual
		
		
		
		
		
		
		
		


	}

}
