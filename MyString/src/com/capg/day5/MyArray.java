package com.capg.day5;

import java.util.Scanner;

public class MyArray {

	public static void main(String[] args)
	{
		String arr[]=new String[5];
		long[] arr1=new long[5];
		double arr2[]= {1,2,3,4,5};
		short[] arr3= {1,2,3,4};
		
		System.out.println(arr.length);
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value of index"+i);
			 arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value of index"+i+""+arr[i]);
		}
		arr1[0]=1;
		arr1[1]=1;
		arr1[2]=1;
		arr1[3]=1;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);

	}

}
