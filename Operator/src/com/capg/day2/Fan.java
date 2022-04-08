package com.capg.day2;

public class Fan
{
	String colour;
	String name;
	double price;
	 public void print()
	 {
		 System.out.println("colour:"+this.colour);
		 System.out.println("name:"+this.name);
	 System.out.println("price:"+this.price);
	 }
	 public Fan(String colour,String name,double price)

	 {
		 this.colour=colour;
		 this.name=name;
		 this.price=price;
	 }

	public static void main(String[] args)
	{
		Fan f=new Fan("white","bajaj",10000);
		f.print();


	}

}
