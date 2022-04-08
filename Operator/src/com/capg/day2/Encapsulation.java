package com.capg.day2;

class Student1
{
	private String name;
	private int id;
	
	public Student1(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setid(int id)
	{
		this.id=id;
	}
}
public class Encapsulation {

	public static void main(String[] args)
	{
		Student1 s=new Student1("Priya",11);
		System.out.println(s.getname());
		System.out.println(s.getid());
		//s.setname();
		//s.setid();
		
	}

}
