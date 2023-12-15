package com.methods;

public class ThreadJoinDemo extends Thread{
	public void run() 
	{
		for(int i=1; i<3; i++)
		{
			try
			{
				System.out.println(Thread.currentThread().getName()+" :"+i+"--> is running");
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
		
	}

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		
		ThreadJoinDemo t1=new ThreadJoinDemo();
		t1.setName("First");
		
		
		ThreadJoinDemo t2=new ThreadJoinDemo();
		t2.setName("Second");
		
		ThreadJoinDemo t3=new ThreadJoinDemo();
		t3.setName("Third");
		
		t1.start();
		t1.join();
		//t2.interrupt();  // throws exception when in waiting
		t2.start();  // t2 waits till t1 complete
		//t1.join();
		t2.join(2000);
		t3.start(); // t3 waits till t2 complete
		
		
		
		
		

	}

}
