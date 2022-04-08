package com.capg.day7;

class MYThread implements Runnable
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

public class MyThreadInterface
{

	public static void main(String[] args)
	{
		 Thread t1=new Thread(new MYThread());
	        Thread t2=new Thread(new MYThread());
	        t1.setName("A");
	        t2.setName("B");
	        t2.setPriority(Thread.MAX_PRIORITY);
	         t1.start();
	         t2.start();
	}

}

