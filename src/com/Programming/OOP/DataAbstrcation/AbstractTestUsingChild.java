package com.Programming.OOP.DataAbstrcation;

public class AbstractTestUsingChild extends AbstractClass
{
	public void greet()
	{
		System.out.println("child....Greet()");
	}

	@Override
	public void show() {

		System.out.println("Show() is implemented by child");
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Scenario1: Parent ref and Parent object: Invalid");
		//AbstractClass a1=new AbstractClass();
		
		System.out.println("Scenario2: Child ref and Child object:Parent+child");
		AbstractTestUsingChild a1=new AbstractTestUsingChild();
		a1.accept();//inherited
		a1.show();//inherited abstract
		a1.greet();//individual
		
		System.out.println("Scenario3: Parent ref and Child object:Parent");
		AbstractClass a2=new AbstractTestUsingChild();
		a2.accept();
		a2.show();
		
		

	}

	

}
