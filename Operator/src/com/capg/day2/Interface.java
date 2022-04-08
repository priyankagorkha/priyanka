package com.capg.day2;

interface A
{
	public void print();
}
class classname
{
	public void println()
	{
		
	}
}
interface B 
{
	public void print();
}
class InterfaceImpl implements A,B
{
	public void print()
	{
		System.out.println("print from class");
	}
}
public class Interface {

	public static void main(String[] args) 
	{
		InterfaceImpl i=new InterfaceImpl();
		i.print();
	}

}
