package com.Programming.OOP.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo4_InterviewQuestions {

	public static void main(String[] args) 
	{
		/*
		 * How to merge two list together: both list type should be same
		 * Way1: Using constructor
		 * Way2: addAll()
		 * 
		 */
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		System.out.println(list1);
		
		//constructor list1+list2
		ArrayList<Integer> list2=new ArrayList<Integer>(list1);
		list2.add(100);
		list2.add(200);
		System.out.println(list2);
		
		//addAll(): list1+list3
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.addAll(list1);
		list3.add(66);
		list3.add(88);
		
		System.out.println(list3);
		
		ArrayList<Integer> finalList=new ArrayList<Integer>();
		finalList.addAll(list1);
		finalList.addAll(list2);
		
		System.out.println(finalList);
		
		//quick way to design ArrayList use Arrays class
		
		List<Integer> number=Arrays.asList(101,201,301,401,501);
		
		List<String> name=Arrays.asList("Sumit","Kiran","Abhi");
		
		System.out.println("Total number elements: "+number.size());
		
		//write logic to sort this array
		
		int arr[]= {12,66,45,10,4,89};
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("--------sort------");
		
		Arrays.sort(arr);
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		System.out.println("-------------Sort any list-------");
		/*
		 * what is difference between Collection and Collections?
		 * ---------------------------------------
		 * Collection is an interface
		 * Collections is class which has static methods
		 */
		
		System.out.println("--------check max without method-----");
		List<Integer> list=Arrays.asList(12,66,45,90,10,4,89);
		
		int first=list.get(0);
		//int max=0;
		for(int i=1;i<list.size();i++)
		{
			int second=list.get(i);
			if(first<second)
			{
				first=second;
			}
		}
		
		System.out.println("Max number is: "+first);
		
		
		
		
		
		System.out.println(list);
		System.out.println("----------------");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("Max element?: "+Collections.max(list));
		System.out.println("Min element?: "+Collections.min(list));
		
		
		//copy()
		ArrayList<Integer> src=new ArrayList<Integer>();
		src.add(111);
		src.add(222);
		src.add(333);
		src.add(444);
		
		System.out.println(src);
		
		//size should be greater or same
		ArrayList<Integer> dest=new ArrayList<Integer>();
		dest.add(0);
		dest.add(0);
		dest.add(0);
		dest.add(0);
		
		
		Collections.copy(dest,src);
		
		System.out.println(dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
