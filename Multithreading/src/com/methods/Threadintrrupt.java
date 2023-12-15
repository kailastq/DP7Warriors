package com.methods;

public class Threadintrrupt extends Thread{
	public void run() {
		for(int i=1; i<=5;i++)
		{
			if(Thread.interrupted())
			{
				System.out.println("Interrupted: "+i);
			}
			else
			{
				System.out.println("Normal: "+i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadintrrupt t1=new Threadintrrupt();
		
		t1.start();
		t1.interrupt();
		

	}

}
