package com.Programming.Array_String;

/*
 * String is collection of characters
 * In java String is immutable class
 * 
 * Ways
 * ============
 * 1.literal
 * --------------
 * Literal string always get memory inside SCP(String constant pool)
 * SCP never allow duplication
 * 
 * 2.New keyword
 * ---------------
 * new keyword way string always get the memory inside JVM heap area
 * duplication allowed
 * 
 */
public class StringDemo1 {

	public static void main(String[] args)
	{

		String s1="Hello";
		
		String s2=new String("Hello");
		
		String s3="Hello";
		
		//String ids will compare
		System.out.println(s1==s2);//false
		
		System.out.println(s1==s3);//true
		
		
		String s4=new String("Hello");
		
		System.out.println(s2==s4);//false
		//data will compare
		//System.out.println(s1.equals(s2));//true
		
		//String is Immutable Class: values can not be modified!
		
		String s5="Hello";
		String s6="Hello";
		System.out.println(s5==s6);//true
		s5=s5+"All";
		System.out.println(s5==s6);//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
