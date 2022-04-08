package com.capg.day2;
public class Car
{
	String name;
	String colour;
	double price;
	
	public void print() {
		System.out.println("Name is: "+name);
		System.out.println("Colour is: "+colour);
		System.out.println("Price is: "+price);
	}
	public Car(String name,String colour,double price)
	{
		this.name=name;
		this.colour=colour;
		this.price=price;
	}
}

public class Car1 {

	public static void main(String[] args)
	{
		Car c=new Car("Skoda","Black",100000);
		c.print();

	}

}
