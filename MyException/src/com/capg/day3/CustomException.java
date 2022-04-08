package com.capg.day3;

import java.util.Scanner;
import java.io.IOException;

class  OnlyPositiveNumberAllowed extends Exception
{
	 OnlyPositiveNumberAllowed(String msg)
	 {
		 super(msg);
	 }
}

public class CustomException {

	public static void main(String[] args) throws OnlyPositiveNumberAllowed
	{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num>0)
	{
		System.out.println(num);
	}
	else
	{
	throw new OnlyPositiveNumberAllowed(" OnlyPositiveNumberAllowed");
	}

	}

}
