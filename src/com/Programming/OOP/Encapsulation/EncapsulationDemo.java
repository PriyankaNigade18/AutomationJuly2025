package com.Programming.OOP.Encapsulation;

/*
 * What is Encapsulation?
 * Wrapping of data and function together in a single unit is called encapsulation
 * 
 * What is Purpose?
 * Data hiding or security
 * 
 * Real time example?
 * Capsule, class, object
 * 
 * How to implement in Java?
 * Declare data as private and provide access using 
 * getters and setters method
 * 
 * setters(): set the data
 * getters(): get the data
 * 
 * 
 * 
 */
//data+method
class Employee
{
	int id=101;
	String name="Sarang";
	private int salary=40000;
	
	
	
	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	//business logic
	public void show()
	{
		System.out.println("Employee id is: "+id);
		System.out.println("Employee name is: "+name);
		System.out.println("Employee salary is: "+salary);
	}
}




public class EncapsulationDemo
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.show();
		
		//e1.salary=20000;
		e1.setSalary(50000);
		
		e1.show();


	}

}
