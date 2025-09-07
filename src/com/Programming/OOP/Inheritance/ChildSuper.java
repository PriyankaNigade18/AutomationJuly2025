package com.Programming.OOP.Inheritance;

public class ChildSuper extends ParentSuper
{
	int cid=201;
	
	public void childIncome()
	{
		System.out.println("Parent id  is: "+super.pid);
		//method
		super.parentIncome();
		System.out.println("Child id is: "+cid);
		System.out.println("Child income is $50000");
	}
	ChildSuper()
	{
		super();//super constructor
		System.out.println("Child constructor is calling....");
	}
	

	public static void main(String args[])
	{
		//child class ref and child object
		ChildSuper c1=new ChildSuper();
		c1.childIncome();
	
		
	}
}
