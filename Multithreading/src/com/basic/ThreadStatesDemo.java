package com.basic;

public class ThreadStatesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread.State[] states= Thread.State.values();
		
		for(Thread.State s:states)
		{
			System.out.println(s);
		}

	}

}
