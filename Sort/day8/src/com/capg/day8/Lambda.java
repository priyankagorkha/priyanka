package com.capg.day8;

interface Lambda1
{
	public void print();
}
interface L2
{
	public void print();
}

interface Suminterface
{
	public void sum(int a,int b);
}
public class Lambda {

	public static void main(String[] args)
	{
		Lambda1 result = () -> System.out.println("Hii");
        result.print();
        L2 res=()->System.out.println("Hello world");
        res.print();
 

        Suminterface sumInterface = (int a, int b) -> { int c = a + b;
            System.out.println(c);
        };
        
        sumInterface.sum(10, 10);
    }

 

   // public static void print() {
      //  System.out.println("Hello Java");
   // }

 

    //public static void addingNumber(int a, int b) {

 

       // int c = a + b;
        //System.out.println(c);
   // }


	}


