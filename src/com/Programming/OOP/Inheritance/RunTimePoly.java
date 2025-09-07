package com.Programming.OOP.Inheritance;

/*
 * Method will be override only when 
 * 1.both the classes must be in relation(IS-A)
 * 2.Parent class same name method if we declare in child class
 * then Child class override Parent class Method
 * 
 * Child always return updated data
 */
class Parent
{
	public void color()
	{
		System.out.println("RED...");
	}
}

class Child extends Parent
{
	@Override
	public void color()
	{
		System.out.println("RED+Blue....");
	}
}


public class RunTimePoly {

	public static void main(String[] args)
	{
		System.out.println("Scenario1: Parent class ref and parent class object:Parent");
		Parent p1=new Parent();
		p1.color();//RED...
		
		System.out.println("Scenario2:Child class ref and Child class object:Parent+child");
		Child c1=new Child();
		c1.color();//red+blue
		
		System.out.println("Scenario3:Parent class ref and Child class object:Parent");
		
		Parent p2=new Child();
		p2.color();//red+blue
		
		
		
		
		
		
		


	}

}
