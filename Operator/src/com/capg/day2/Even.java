package com.capg.day2;

public class Even {

	public static void main(String[] args)
	{
		int number=100;
		System.out.println("List of even numbers from 1 tO "+number+":");
		for(int i=0;i<=number;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"");
			}
		}

	}

}
