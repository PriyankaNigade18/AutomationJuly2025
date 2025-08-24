package com.Programming.Array_String;

public class MultiDArray {

	public static void main(String[] args) 
	{
		//using new keyword
		
		int arr[][]=new int[4][2];
		arr[0][0]=10;
		arr[0][1]=20;
		
		arr[1][0]=30;
		arr[1][1]=40;
			
		arr[2][0]=50;
		arr[2][1]=55;
		
		arr[3][0]=60;
		arr[3][1]=70;
		
		System.out.println(arr[2][1]);//55
		System.out.println(arr[1][1]);//40
		//System.out.println(arr[3][2]);//ArrayIndexOutOfBoundsException

		//length: row-->cell-->value
		System.out.println("Number of rows: "+arr.length);//4
		System.out.println("Number of columns: "+arr[0].length);//2
		
		System.out.println("--------Iteration---------------");
		
		
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("-----------Way2: literal way---------------");
		
		int id[][]= {{1,2},{100,110},{200,210},{300,310},{400,410}};
		System.out.println("Number of rows: "+id.length);//4
		System.out.println("Number of columns: "+id[0].length);//2
		System.out.println(id[2][1]);//310
		
		for(int r=1;r<id.length;r++)//skip heading start row index from 1
		{
			for(int c=0;c<id[r].length;c++)
			{
				System.out.print(id[r][c]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		for(int i[]:id)//row[100,110]
		{
			for(int j:i)//cell
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
