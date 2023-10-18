package com.MethodOverriding;


class Vehicle1{
	int data=50;
	
	//throws unchecked exception
	
	void showData() throws ArithmeticException
	{
		System.out.println(data);
	}
}

// child class : Overriding : can throw unckecked exception
//                                         or throw sub class of unchecked exception or other exception
//   but it cannot throw checked exception

class Car1 extends Vehicle1
{
	int val=0;
	
	void showData() throws RuntimeException, ArrayIndexOutOfBoundsException
	{
		if(val==0)
			throw new ArithmeticException();
		System.out.println(data/val);
		
		// throw new IOException();
	}
}
public class UncheckedOverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
