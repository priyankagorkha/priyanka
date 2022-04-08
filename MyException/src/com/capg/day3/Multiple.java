package com.capg.day3;

class A1
{
	public void printA()
	{
		System.out.println("class A");
		System.out.println("class A has object class");
	}
}
class B1 extends A1
{
	public void printB()
	{
		System.out.println("class B");
		System.out.println("clacc B1 inherit class A1");
	}
}
class C extends B1
{
	public void printC()
	{
		System.out.println("class C");
		
	}
}
public class Multiple {

	public static void main(String[] args) {
		C obj=new C();
		obj.printA();
		obj.printB();
		obj.printC();
		

	}

}
