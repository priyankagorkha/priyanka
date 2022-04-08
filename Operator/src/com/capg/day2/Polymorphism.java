package com.capg.day2;
 class College
 {
	 public void study()
	 {
		 System.out.println("Studing...");
	 }
	 public void study1(int homework)
	 {
		 System.out.println("doing homework");
	 }
	 public void study2(double homework)
	 {
		 System.out.println("Double hw");
	 }
	 public void study3(float homework)
	 {
		 System.out.println("Triple hw");
	 }
 }
 class School extends College
 {
	 public void study6()
	 {
		 System.out.println("School");
	 }
 }
public class Polymorphism {

	public static void main(String[] args)
	{
		School s=new School();
		s.study6();
		//College coll=new College();
		//coll.study();	
		//coll.study(12);
		//coll.study(1234);
		//coll.study(23.4);
		

	}

}
