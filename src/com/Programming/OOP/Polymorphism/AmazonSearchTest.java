package com.Programming.OOP.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args)
	{
		AmazonSearch a1=new AmazonSearch();
		a1.search("Mobile");
		a1.search(50000);
		a1.search(900000,"iphone");
		a1.search("Bag",20000);
		a1.search("watch","Rado");

	}

}
