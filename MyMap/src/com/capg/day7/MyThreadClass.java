package com.capg.day7;

class MyThreadC extends Thread
{

	@Override
	public void run()
	{
		 for(int i=0;i<10;i++)
	        {
	            System.out.println(Thread.currentThread().getName()+" "+i);
	        }
	        
	    }
	}

public class MyThreadClass {

	public static void main(String[] args) 
	{
		  MyThreadC t1=new MyThreadC();
		    MyThreadC t2=new MyThreadC();
		    t1.setName("priya");
		    t2.setName("abc");
		    t2.setPriority(10);
		    t1.start();
		    t2.start();

	}

}
