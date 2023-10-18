package com.MethodOverriding;

import java.io.IOException;

class Vehicle2 {

	int data = 50;

	// throws checked exception

	void printData() throws IOException {
		System.out.println(data);
	}

}

// child class : overriding: can throw unchecked exception
//
// it can throw : same checked exception, sub type
// not super type
//

class Car2 extends Vehicle2 {

	int val = 10;

	void printData() throws ArithmeticException, IOException// , ExceptionUnCheckedOverriding2.java
	{
		if (val == 0)
			throw new ArithmeticException();
		System.out.println(data / val);

		// throw new IOException();
	}

}

public class CheckedOverriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
