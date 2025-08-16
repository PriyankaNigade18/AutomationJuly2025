package com.Programming.Methods_Constaructor;

public class InsanceVsStaticVariable
{
	//instance
	//int count=1;
	static int count=1;
	
	public InsanceVsStaticVariable()
	{
		System.out.println(count);
		count++;
		
	}
	
	public static void main(String[] args)
	{
		InsanceVsStaticVariable i1=new InsanceVsStaticVariable();
		InsanceVsStaticVariable i2=new InsanceVsStaticVariable();
		InsanceVsStaticVariable i3=new InsanceVsStaticVariable();
		InsanceVsStaticVariable i4=new InsanceVsStaticVariable();
		InsanceVsStaticVariable i5=new InsanceVsStaticVariable();
		

	}

}
