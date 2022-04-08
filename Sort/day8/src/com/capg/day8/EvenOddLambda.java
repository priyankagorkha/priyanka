package com.capg.day8;

interface Lambda2
{
	public void print();
}
interface EvenOdd
{
	public void even(int a);
}

public class EvenOddLambda {

	public static void main(String[] args) 
	{
		Lambda2 res=()->System.out.println("Even Odd");
		res.print();
		EvenOdd e1=(int a)->{ if(a%2==0) {
			System.out.println("It is even "+a);
		}
		else
		{
			System.out.println("It is odd "+a);
		}
	};
e1.even(5);
}
}