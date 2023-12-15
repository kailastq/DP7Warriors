package com.basic;

public class RunnableDemo implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo r1=new RunnableDemo();
		RunnableDemo r2=new RunnableDemo();
		
		Thread t;
		t=new Thread(r1);
		
		t.start();
		
		t=new Thread(r2);
		t.start();
		
		t=new Thread(new RunnableDemo());
		t.start();

	}

	

}
