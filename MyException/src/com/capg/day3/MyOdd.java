package com.capg.day3;
import java.io.IOException;
import java.util.Scanner;
//Class can be converted to exception class by extending the Exception class
class UnderAge extends Exception
{
	UnderAge(String msg)
    {
    	super(msg);
    }
}

public class MyOdd {

	public static void main(String[] args) throws UnderAge 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			throw new UnderAge("not eligible to vote");
		}

	}

}
