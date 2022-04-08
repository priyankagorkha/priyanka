package com.capg.day2;

public class Employee 
{
	String name;
	String loc;
	int id;
	double sal;
	int phno;
	
	public void print()
	{
     System.out.println("Name is:"+name);
     System.out.println("Location is:"+loc);
     System.out.println("ID is:"+id);
     System.out.println("Salary is:"+sal);
     System.out.println("Phone no is:"+phno);
	}
	public Employee(String name,String loc,int id,double sal,int phno)
	{
		this.name=name;
		this.loc=loc;
		this.id=id;
		this.sal=sal;
		this.phno=phno;
	}

	public static void main(String[] args) 
	{
		Employee e=new Employee("Priya","Pune",1234,20000,1234567890);
		e.print();

	}

}
