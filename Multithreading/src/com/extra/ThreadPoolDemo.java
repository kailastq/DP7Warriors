package com.extra;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Mygame implements Runnable
{
	private String taskName;
	
	Mygame()
	{
		
	}
	
	Mygame(String taskName)
	{
		super();
		this.taskName=taskName;
	}
	
	public void run() {
		
		Date d=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("hh:mm:ss");
		for(int i=0;i<5;i++)
		{
			if(i==0)
			{
				
						System.out.println("<<Initialized: "+i+">>"+taskName+"-->"+sf.format(d));
			}
			else
			{
				System.out.println("<<Executing task: "+i+">>"+taskName+"-->"+sf.format(d));
			}
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		}
	}
}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Mygame("Play Music");
		Runnable r2=new Mygame("Score Points");
		Runnable r3=new Mygame("Move Car ");
		Runnable r4=new Mygame("Accelerate");
		Runnable r5=new Mygame("Apply Brakes");
		
		ExecutorService ex=Executors.newFixedThreadPool(3);
		
		ex.execute(r1);
		ex.execute(r2);
		ex.execute(r3);
		ex.execute(r4);
		ex.execute(r5);
		
		ex.shutdown();


	}

}
