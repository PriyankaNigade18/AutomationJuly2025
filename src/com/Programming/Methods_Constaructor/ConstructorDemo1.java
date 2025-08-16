package com.Programming.Methods_Constaructor;


/*Constructor is used to initilize object
 * Types
 * --------
 * 1.Default 
 * 2.Parameterized
 * 
 * By default jvm calls default constructor
 * 
 * Constructor overloading is possible but overriding is not possible
 * 
 * no return type for constructor 
 * 
 * 
 */
public class ConstructorDemo1 
{
	int id;
	String name;
	
	//default
	public ConstructorDemo1()//0 parameters
	{
		System.out.println("Default constructor is Calling....");
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}
	
	//parameterized 
	public ConstructorDemo1(int i,String n)//local
	{
		System.out.println("Parameterized constructor is calling....");
		//local data assigning to Instance data
		id=i;
		name=n;
		System.out.println("id is: "+id);
		System.out.println("name is: "+name);
	}

	
	public static void main(String[] args) 
	{
		
		ConstructorDemo1 c1=new ConstructorDemo1();
		
		ConstructorDemo1 c2=new ConstructorDemo1(101,"Jay");

	}

}
