package com.Programming.coreJava;

public class AccessModifiers
{
	
	int id=101;//default
	public String name="Sarang";
	private long phono=9877665477L;

	public static void main(String[] args) 
	{
		System.out.println("Calling variable in same class");
		
		AccessModifiers a1=new AccessModifiers();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phono);
	}

}
