package com.Programming.coreJava;

public class WrapperClassDemo {

	public static void main(String[] args)
	{
		/*
		 * Wrapper class used to store primitive data as Object
		 * for every data type we have wrapper classes
		 * int    	Integer
		 * float  	Float
		 * double  	Double etc
		 * 
		 * Object to primitive used Wrapper clases
		 * 
		 * String is class and String is collection of character
		 * String s1="Hello";
		 * s1[]={'H','e','l','l','o'}
		 */
		
		
		String s1="100";
		//String s1="100ABC";//object
		System.out.println(s1+100);//100100
		//primitive
		int n1=Integer.parseInt(s1);//NumberFormatException
		System.out.println(n1+100);//200
		
		
		String s2="67.22";
		System.out.println(s2+11.11);//67.2211.11
		//double
		double d1=Double.parseDouble(s2);
		System.out.println(d1+11.11);//78.33
		
		//String class have method charAt(index):char
		String s3="Hello";
		char ch=s3.charAt(0);
		System.out.println(ch);//H
		
		
	
		
		System.out.println("-----------------------------------");
		
		//Primitive to Object(String) (valueOf())
		
		int num=90;
	
		System.out.println(num+100);//190
		String ss1=String.valueOf(num);
		System.out.println(ss1+100);//90100
	
		float f1=89.77f;
		String ss2=String.valueOf(f1);
		System.out.println(ss2+11.11f);
		
		int r=90;
		Integer i1=Integer.valueOf(r);
		System.out.println(i1);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
