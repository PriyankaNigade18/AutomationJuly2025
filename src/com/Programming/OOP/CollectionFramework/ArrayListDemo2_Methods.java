package com.Programming.OOP.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList is Class implements List interface
 * Underline data structure is Dynamic Array
 * Frequent operation Data Retrieval
 * It is order collection
 * Duplication allowed
 * By default ArrayList create 10 virtual segment
 * Initial capacity is 10
 */
public class ArrayListDemo2_Methods {

	public static void main(String[] args)
	{
		List<Integer> al=new ArrayList<Integer>();
		System.out.println("Initally Is list empty?: "+al.isEmpty());//true
		al.add(10);
		al.add(20);
		al.add(11);
		al.add(30);
		al.add(24);
		al.add(70);
		
		System.out.println("After adding element Is list empty?: "+al.isEmpty());//false
		System.out.println("Total Elements are: "+al.size());
		System.out.println(al);
		
		//search: look for 50? : contains(Object)
		System.out.println("In list look for 50?: "+al.contains(50));//false
		
		System.out.println("In list look for 30?: "+al.contains(30));//true
		
		//insert element at index 3rd position: add(index,object)
		
		al.add(3,null);
		
		System.out.println(al);
		
		al.add(4,null);
		System.out.println(al);
		
		//remove element: remove(index)
		al.remove(4);
		
	    System.out.println(al);
	    
	    //delete all the elements from list: clear()
//	    al.clear();
//	    System.out.println(al);//[]
//	    System.out.println(al.size());//0
	    
	    List<Integer> subl=al.subList(2,5);//[2,3,4]
	    System.out.println(subl);//start from 2index and end on lastindex-1
	    
	    //indexOf(Object)
	    System.out.println("Index of null object?: "+al.indexOf(null));
	    
	    al.add(20);
	    al.add(44);
	    al.add(20);
	    
	    System.out.println(al);
	    System.out.println("first elemenet index for 20: "+al.indexOf(20));
	    System.out.println("last element index for 20: "+al.lastIndexOf(20));
	    
	    /* index for middle element
	   int index= al.subList(4,9).indexOf(20);
	    System.out.println("Middle element index for 20: "+index);//7
	    *
	    */
	    int firstIndex = al.indexOf(20);  // Get the index of the first occurrence
	    int secondIndex=-1;  // Default value if no second occurrence is found

	    if (firstIndex != -1) {
	        // Start searching from the next index after the first occurrence
	        for (int i = firstIndex + 1; i < al.size(); i++) {
	            Integer currentElement = al.get(i);  // Get the element at index i
	            
	            // Check if the current element is not null and equals 20
	            if (currentElement != null && currentElement == 20) {
	                secondIndex = i;
	                break;  // Once the second occurrence is found, exit the loop
	            }
	        }
	    }

	    System.out.println("Index of second 20: " + secondIndex);
	    Object arr[]=al.toArray();
	    for(Object i:arr)
	    {
	    	System.out.println(i);
	    }
	    
	  
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
