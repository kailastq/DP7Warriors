package com.basic;

public class ThreadClassDemo extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadClassDemo t1=new ThreadClassDemo();
		ThreadClassDemo t2=new ThreadClassDemo();
		ThreadClassDemo t3=new ThreadClassDemo();
		
		
		// Separate call stack is create to promote context switching
		// run() : No separate call stack : o/p will be main for all threads
//		t1.run();
//		t2.run();
//		t3.run();
		
		System.out.println("----------------------");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
