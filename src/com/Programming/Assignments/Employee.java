package com.Programming.Assignments;

public class Employee 
{
	//data
	int empId;
	String empName;
	
	
	//method
	public void display()
	{
		System.out.println("Employee id is: "+empId);
		System.out.println("Employee name is: "+empName);
	}
	
	public static void main(String args[])
	{
		//To call class member object is required
		Employee e1=new Employee();
		e1.empId=101;
		e1.empName="Sagar";
		e1.display();
		Employee e2=new Employee();
		e2.empId=102;
		e2.empName="Sana";
		e2.display();
	}
	
	
	
	
	

}
