package com.Programming.OOP.Inheritance;

class X
{
	public void m1()
	{
		System.out.println("M1 is calling.....");
	}
}

class Y extends X //Single level inheritance where X is parent and Y is child
{
	public void m2()
	{
		System.out.println("M2 is calling.....");
	}
}

class Z extends Y //Multilevel Y is parent for Z class
{
	public void m3()
	{
		System.out.println("M3 is calling......");
	}
}

class V extends X//Hierarchical inheritance where X is parent and V is child
{
	public void m4()
	{
		System.out.println("M4 is calling...............");
	}
}


public class InheritanceDemoTypes {

	public static void main(String[] args)
	{

		System.out.println("Scenario1: Parent class ref and Parent class Object:Parent methods");
		//single level with X is parent and Y is child	
//		X a1=new X();
//		a1.m1();//individual method
		
		//multilevel X--->y--->Z
//		Y y1=new Y();
//		y1.m1();//inherited
//		y1.m2();//individual
		
		//Hierarchical inheritance X----->V
		X a1=new X();
		a1.m1();
		
			
		System.out.println("Scenario2: Child class ref and Child class Object: Parent +Child");
		
//		Y b1=new Y();
//		b1.m1();//Inherited method
//		b1.m2();//individual method
		
		//multilevel X--->y--->Z
//		Z z1=new Z();
//		z1.m1();//inherited
//		z1.m2();//inherited
//		z1.m3();//individual
		
		//Hierarchical inheritance X----->V
		V v1=new V();
		v1.m1();
		v1.m4();
			
		System.out.println("Scenario3: Parent class ref and Child class Object: Parent class");
		
//		X a2=new Y();
//		a2.m1();//individual
		
		//multilevel X--->y--->Z
		
//		Y y2=new Z();
//		y2.m1();//inherited
//		y2.m2();//individual
//		
		//Hierarchical inheritance X----->V
		X a2=new V();
		a2.m1();
	
		System.out.println("Scenario4: Child class ref and Parent class Object: Invalid");
		
		//B b2=new A();
		
		
		
		
		
		
		
		


	}

}
