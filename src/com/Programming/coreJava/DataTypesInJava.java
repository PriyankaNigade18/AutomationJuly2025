package com.Programming.coreJava;

public class DataTypesInJava {

	public static void main(String[] args) 
	{
		// Primitive data types
		//boolean true/false 1bit memory
		boolean status=true;
		System.out.println("status is: "+status);//true
		//boolean status=false; redeclration is not allowed
		status=false;//reassignments
		System.out.println("Updated status is: "+status);//false
		
		boolean newStatus=false;
		System.out.println("boolean data is: "+newStatus);
		
		System.out.println("-------------------------------------");
		
		//Primitive-->Numeric-->character
		/*
		 * 2byte
		 * character type represent in java with char keyword
		 * 1.Single character  'A'
		 * 2.Special Character '*'
		 * 3.ASCII value for character
		 * 
		 * A-Z= 65 to 90
		 * a-z= 97 to 122
		 * 0-9= 48 to 57
		 *  
		 */
		
		char c1='A';
		System.out.println("Single Character data is: "+c1);//A
		
		char c2='#';
		System.out.println("Special character data is: "+c2);//#
		
		char c3=98;//here c3 is reading 98 is ascii value of character
		System.out.println("ASCII value 98 for character: "+c3);//b
		
		char c4=65;
		System.out.println("65 ASCII for character: "+c4);//A
		
		
		System.out.println("-------------Integer--------------------");
		//primitive-->Numeric--->Integral-->Integer
		//By default every number in java is an int type
		//byte-->short-->int-->long
		
		//byte 1byte -128 to 127
		byte b1=127;
		byte b2=-128;
		
		byte b3=-111;
		//Type mismatch: cannot convert from int to byte
		//byte b4=130;
		//byte b4=128;
		
		System.out.println("Byte data is: "+b1);
		System.out.println("Byte data is: "+b2);
		System.out.println("Byte data is: "+b3);
		
		//short 2byte -32768 to 32767
		short s1=30000;
		short s2=-31000;
		//Type mismatch: cannot convert from int to short
		//short s3=50000;
		System.out.println("short data is: "+s1);
		
		System.out.println("short data is: "+s2);
		
		//int 4byte
		
		int i1=50000;
		//The literal 8698675654564 of type int is out of range 
		//int i2=8698675654564;
		
		int i2=986798798;
		
		System.out.println("Integer data is: "+i1);
		System.out.println("Integer data is: "+i2);
		
		//long 8byte add suffix value as L
		long l1=8698675654564L;
		System.out.println("Long data is: "+l1);
		
		long l2=67878970L;
		System.out.println("Long data is: "+l2);
		
		System.out.println("------Floating point number------");
		
		//primitive-->Numeric--->Integral-->Floating point
		//By default every decimal digit number in java is double type
		//float 4byte double 8byte
		
		double d1=878687687.679809;
		double d2=89.6785;
		System.out.println("double type data is: "+d1);
		System.out.println("double type data is: "+d2);
		
		float f1=98.66F;
		System.out.println("float data is: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
