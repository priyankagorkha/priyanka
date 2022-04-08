package com.capg.day3;
 class A
{ 
	 public void print()
	 {
		 System.out.println("class A");
	 }
	
}
 class B extends A
 {
	 
 }
public class Single 
{

	public static void main(String[] args) 
	{
		
      B b=new B();
      b.print();
	}

}
