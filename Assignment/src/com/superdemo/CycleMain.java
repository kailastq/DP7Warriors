package com.superdemo;

class Cycle{
	private int accNo;
	private int noOfWheels ;
	
	Cycle(){
		System.out.println("I am Default Constructor");
		
	}
	
	Cycle(int accNo, int noOfWheels){
		System.out.println("I am another Constructor");
		this.accNo=accNo;
		this.noOfWheels=accNo;
	}
}

public class CycleMain {
	

	public static void main(String[] args) {
		
		// Cycle cycle=new Cycle();
		
		Cycle c1=new Cycle(100, 3);
		System.out.println(c1);

	}

}
