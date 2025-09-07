package com.Programming.OOP.Inheritance;

public class AccessModifierSamePackageClass
{
	int id=101;//default
	public String name="Sarang";
	private long phno=987655444;
	protected int acno=7777777;
	
	public static void main(String[] args)
	{
		System.out.println("same class");
		
		AccessModifierSamePackageClass a1=new AccessModifierSamePackageClass();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);
	}

}
