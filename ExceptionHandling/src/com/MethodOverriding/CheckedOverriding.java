package com.MethodOverriding;

import java.io.IOException;

class Vehicle
{
	int data=50;
	
	void showData()
	{
		System.out.println(data);
	}
}

class Car extends Vehicle
{
	int val=0;
	
	void showData() throws ArithmeticException  // IOException
	{
		if(val==0)
			
			throw new ArithmeticException();
		System.out.println(data/val);
		
		//throws new IOException();
	}
}

public class CheckedOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
