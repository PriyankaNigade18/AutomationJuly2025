package com.Programming.OOP.Inheritance;

class A
{
	public void m1()
	{
		System.out.println("M1 is calling.....");
	}
}

class B extends A //Single level inheritance where A is parent and B is child
{
	public void m2()
	{
		System.out.println("M2 is calling.....");
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args)
	{

		System.out.println("Scenario1: Parent class ref and Parent class Object:Parent methods");
			A a1=new A();
			a1.m1();//individual method
		
		
		
		System.out.println("Scenario2: Child class ref and Child class Object: Parent +Child");
		
		B b1=new B();
		b1.m1();//Inherited method
		b1.m2();//individual method
		
			
		System.out.println("Scenario3: Parent class ref and Child class Object: Parent class");
		
		A a2=new B();
		a2.m1();//individual
		
	
		System.out.println("Scenario4: Child class ref and Parent class Object: Invalid");
		
		//B b2=new A();
		
		
		
		
		
		
		
		


	}

}
