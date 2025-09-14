package com.Programming.OOP.CollectionFramework;

import java.util.ArrayList;

/*
 * ArrayList is Class implements List interface
 * Underline data structure is Dynamic Array
 * Frequent operation Data Retrieval
 * It is order collection
 * Duplication allowed
 * By default ArrayList create 10 virtual segment
 * Initial capacity is 10
 */
public class ArrayListDemo1 {

	public static void main(String[] args) 
	{
		
		//Generic Way: It is type safe and type casting not required
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		System.out.println(al);
		
		int number=al.get(0);
		System.out.println(number);
		
		
		
		
		
		
		
		
		/*
		// Non Generic way: 1.It is not type safe 2.type casting required
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		ArrayList ls=new ArrayList();
		ls.add(100);
		ls.add("Jay");
		ls.add(89.778);
		ls.add('Y');
		ls.add("ghjghj787");
		
		System.out.println(ls);
		
		//get the first element: get(index)
		
		int number=(int) ls.get(0);
		System.out.println(number);//100
		
		*/
		
		
		
		
		
		
		
		
		

	}

}
