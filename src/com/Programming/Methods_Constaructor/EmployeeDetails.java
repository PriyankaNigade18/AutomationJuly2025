package com.Programming.Methods_Constaructor;


/*
 * this keyword is used to refer current class instance variable and instance method(Object)
 * UseCase1: this can be used to refer current class instance variable.
 * Differntiate between local and instance variable

 */
public class EmployeeDetails 
{
	int empId;
	String empName;

	EmployeeDetails(int empId,String empName)
	{
		/*=empId;
		empName=empName;*///Local to local assignment
		this.empId=empId;
		this.empName=empName;
	}
	
	public void display()
	{
		System.out.println("Employee id is: "+empId);
		System.out.println("Employee name is: "+empName);
	}
	
	public static void main(String[] args) 
	{
		EmployeeDetails e1=new EmployeeDetails(101,"Sarang");
		e1.display();
		


	}

}
