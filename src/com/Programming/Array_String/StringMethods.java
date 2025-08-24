package com.Programming.Array_String;

public class StringMethods {

	public static void main(String[] args) 
	{
		//lenght():total characters 
		String s1="Hello All";
		System.out.println("Length of current string is: "+s1.length());//9
		
		//string conversion: toLowerCase()  toUpperCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//String equality : equals():case sensitive  equalsIgnoreCase():not case sensitive
		String act="Welcome";
		String exp1="Welcome";
		String exp2="welcome";
		System.out.println(act.equals(exp1));//true
		System.out.println(act.equals(exp2));//false
		
		System.out.println(act.equalsIgnoreCase(exp1));//true
		System.out.println(act.equalsIgnoreCase(exp2));//true
		
		//trim(): To remove white space before and after string
		String s2="       Welcome    All         ";
		System.out.println(s2);
		System.out.println(s2.trim());
		
		//charAt(index)

		String s3="Automation Testing";
		System.out.println("character at index 5: "+s3.charAt(5));//a
		
		//to get the index of a character:indexOf(char):first occurrence
		System.out.println("Index of character i is: "+s3.indexOf('i'));//7
		
		//to get the next occurrence index value of char i:indexOf(char,fromindex)
		System.out.println("to get the next occurrence index value of char i: "+s3.indexOf('i',8));
	
		//contains()
		
		//startsWith() endsWith()
		
		//replace()
		
		//substring()
		
		//toCharArray()
		
		//concat()
		
		//isEmpty()
		
		//isBlank()
		
		//split()

	
		
		
		
		
		
		
		
		
		
		
		

	}

}
