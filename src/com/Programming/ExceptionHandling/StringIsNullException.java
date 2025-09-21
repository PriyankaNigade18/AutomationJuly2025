package com.Programming.ExceptionHandling;

public class StringIsNullException extends Exception 
{

	public StringIsNullException(String msg)
	{
		System.out.println(msg);
	}
}
