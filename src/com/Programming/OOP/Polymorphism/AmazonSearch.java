package com.Programming.OOP.Polymorphism;

public class AmazonSearch 
{
	public void search(String pname)
	{
		System.out.println("Product searched by name: "+pname);
	}
	
	public void search(int price)
	{
		System.out.println("Product searched by price: "+price);
	}
	
	public void search(String pname,String bname)
	{
		System.out.println("Product searched by product name: "+pname+" & brand name: "+bname);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Product searched by product name: "+pname+" & price: "+price);
	}

	public void search(int price,String bname)
	{
		System.out.println("Product searched by productp price: "+price+" & brand name: "+bname);
	}
}
