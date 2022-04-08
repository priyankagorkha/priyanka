package com.capg.day5;

public class String
{
public static void main (String[] args)
{
	String str="Hello";
	
	String str1=new String("Hello");
	String str2="Hello";
	
	if(str.equals.IgnoreCase(str1))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	
	String one="A";
	String two="A";
	
	System.out.println(one.compareTo(two));
	str.charAt(0);
	System.out.println(str.charAt(0));
	
	System.out.println(str.concat(str2));
	
	System.out.println(str.contains("Bell"));
	
	byte[] b=str.getBytes();
	
	System.out.println(str.indexOf("e"));
	String str4="";
	System.out.println(str4.isBlank());
	
	System.out.println(str.length());
	
	str.lastIndexOf(0);
	
	str.replace("H","J");
	System.out.println(str.replace("H","J"));
	
	System.out.println(str.subSequence(0,3));
	
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	String str6="hello java";
	
	System.out.println(str6.trim());
	System.out.println(str6);
	
	
}
}
