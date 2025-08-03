package com.Programming.coreJava;

public class TypeCasting {

	public static void main(String[] args)
	{
		//primitive to primitive
		
		//Implicit type casting (Automatic casting(JVM)) small size--->to large size
		//byte-->short-->int-->long-->float-->double
		
		int x=100;//4byte
		long l1=x;//8byte
		System.out.println("int to long conversion: "+l1);//100
		
		char c1='A';//2byte
		int i1=c1;//4byte
		System.out.println("char to int conversion: "+i1);//65
		
		int y=78;//4byte
		float f1=y;//4byte
		System.out.println("int to float conversion: "+f1);//78.0
		
		long l2=689789L;//8byte
		float f2=l2;
		System.out.println("long to float conversion: "+f2);//689789.0
		
		
		//Explicit casting manual casting(casting operator)
		long l3=7889789L;
		System.out.println(l3);
		int q=(int) l3;//Type mismatch: cannot convert from long to int
		System.out.println("long data into int: "+q);
		
		int r=98;
		char c2=(char) r;
		System.out.println("int to char conversion: "+c2);//b
		
		float f3=89.66F;
		int i=(int) f3;
		System.out.println("float to int conversion: "+i);//89
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
