package com.capg.day2;

public class Car {
	String colour;
	String name;
	double price;
	 public void print()
	 {
		 System.out.println("colour:"+this.colour);
		 System.out.println("name:"+this.name);
	 System.out.println("price:"+this.price);
	 }
	 public Car(String colour,String name,double price)

	 {
		 this.colour=colour;
		 this.name=name;
		 this.price=price;
	 }


	public static void main(String[] args)
	{
		Car c=new Car("black","Audi",100000);
		c.print();


	}

}
