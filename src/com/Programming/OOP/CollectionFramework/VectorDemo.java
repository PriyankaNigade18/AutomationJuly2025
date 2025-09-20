package com.Programming.OOP.CollectionFramework;

import java.util.Vector;

/*
 * Vector is class implement List interface
 * Underline data structure is Dynamic array
 * Vector It is synchronize(one process at a time) thread safe
 * Performance wise it is slow
 * 
 * 
 */
public class VectorDemo {

	public static void main(String[] args) 
	{

		Vector<Integer> vs=new Vector<Integer>();
		if(vs.isEmpty())
		{
			vs.add(10);
			vs.add(20);
			vs.add(30);
			vs.add(40);
			vs.add(50);
			vs.add(50);
			
		}
		System.out.println(vs);
		System.out.println("Total elements are: "+vs.size());
		
		for(Integer i:vs)
		{
			System.out.println(i);
		}
		
		
		vs.remove(5);
		
		System.out.println(vs);
		
		
		
		
		
		
		
		
		
		

	}

}
