package com.Programming.OOP.Polymorphism;
/*
 * Polymorphism: One thing in many form we can use
 * 
 * what is purpose?
 * Polymorphism used for reusability
 * 
 * Types of Polymorphism
 * ---------------------
 * 1.Compile time poly
 * 2.Run time Poly
 * 
 * Compile time polymorphism
 * ------------------------------
 * When same name method is reused in same class with different signature
 * then it is called compile time or Method overloading
 * 
 * What is different signature
 * --------------------------------
 * Method should have same name
 * 	1.number of parameters allowed
 * 	2.Different type of data allowed
 * 	3.Order of parameters can be different
 * 
 * Is Main() overloading is possible?
 * ---------------------------------------
 * Yes, main() overloading is possible but practically we dont need it
 * Main() overriding is not possible
 * 
 * Constructor overloading is Possible?
 * ----------------------------------------
 * Yes, constructor overloading is possible and it refer as constructor chaining
 * 
 * Constructor overriding is not possible
 * 
 * What is Real time examples:
 * ---------------------------
 * payment gateway
 * Ola/zomato/uber
 * 
 * what is constructor overloading/chaining
 * -------------------------------------------
 * when same name constructor we reuse in same class with different signature 
 * is called constructor chaining or overloading
 * 
 */
public class ConctructorChainingOverloading 
{
	
	public ConctructorChainingOverloading()
	{
		System.out.println("This is default constructor...");
	}
	//different type
	public ConctructorChainingOverloading(int id)//1 
	{
		System.out.println("This is parameterized constructor...id is: "+id);
	}
	//number of parameters
	public ConctructorChainingOverloading(String name)//1
	{
		System.out.println("This is parameterized constructor...name is: "+name);
	}
	
	public ConctructorChainingOverloading(int id,String name)//2
	{
		System.out.println("This is parameterized constructor...id is: "+id+" & name is:"+name);
	}
	
	//change order
	public ConctructorChainingOverloading(String name,int id)//2
	{
		System.out.println("This is parameterized constructor...id is: "+id+" & name is:"+name);
	}
	
	public static void main(String[] args)
	{

		ConctructorChainingOverloading c1=new ConctructorChainingOverloading();
		ConctructorChainingOverloading c2=new ConctructorChainingOverloading(101);
		ConctructorChainingOverloading c3=new ConctructorChainingOverloading("Jay");
		ConctructorChainingOverloading c4=new ConctructorChainingOverloading("Sarang",200);
	}

}
