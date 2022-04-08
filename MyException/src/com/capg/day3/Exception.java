package com.capg.day3;

public class Exception {

	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		int c=a/b;
		try
		{
			System.out.println(c);
			
		}
			catch(ArithmeticException e)
			{
				System.out.println("some error"+0);
			}
		//catch(ArrayException a1)
		//{
			
		//}
		finally
		{

			System.out.println("it is a final block");
	
		}
		System.out.println("Catch is trying to catch");
		}

	}


