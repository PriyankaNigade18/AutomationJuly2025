package com.Programming.OOP.DataAbstrcation;


/*
 * Data abstraction
 * --------------------
 * Hiding internal details of software and providing relevant features to user is called
 * data abstraction
 * 
 * Purpose: Hiding information/internal details
 * 
 * Real time example:
 * ATM
 * Google Map
 * 
 * How to implement in Java
 * ============================
 * 1.Using Abstract class
 * -----------------------
 * Class declare with abstract keyword is abstract class
 * Abstract class can have implemented method and abstract method
 * Abstract method is method without body
 * for Partial abstraction we use abstract class
 * And Abstract class Object we can't create 
 * To call methods we need child class
 * Child class can implement all abstract methods from parent
 * 
 * 
 * 2.Using Interface
 * 
 * 
 * 
 */



public abstract class AbstractClass
{
	//implemented
	public void accept()
	{
		System.out.println("Abstract class....Fully implemented methiod Accept()");
	}
	
	//non implemented/ abstract method
	
	public abstract void show();
	
	
	public static void main(String args[])
	{
		//Cannot instantiate the type AbstractClass
		//AbstractClass a1=new AbstractClass();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
