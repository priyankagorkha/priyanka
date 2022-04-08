package com.capg.day2;

public class Student 
{
	int id;
	String name;
	String loc;
	String blood;
	String gender;
	
	public int getid()
	{
		return this.id;
	}
	public String getname()
	{
		return this.name;
	}
	public String getloc()
	{
		return this.loc;
	}
	public String getblood()
	{
		return this.blood;
	}
	public String getgender()
	{
		return this.gender;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setloc(String loc)
	{
		this.loc=loc;
	}
	public void setblood(String blood)
	{
		this.blood=blood;
	}
	public void setgender(String gender)
	{
		this.gender=gender;
	}
	
	public static void main(String[] args)
	{
		Student s=new Student();
		s.setid(1);
		s.setname("priya");
		s.setloc("pune");
		s.setblood("O");
		s.setgender("female");
		System.out.println(s.getid());
		System.out.println(s.getname());
		System.out.println(s.getloc());
		System.out.println(s.getblood());
		System.out.println(s.getgender());
		
		
		
        
	}

}
