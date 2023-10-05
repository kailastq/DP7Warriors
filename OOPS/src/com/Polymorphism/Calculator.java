package com.Polymorphism;

class Calculate {

	void square(int a) {
		System.out.println("Square of number is: " + (a * a));
	}

	void multiplication(int a, int b) {
		System.out.println("Multiplication is: " + (a * b));
	}

	void Division(int a, int b) {
		System.out.println("Division is: " + (a / b));
	}

}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate square = new Calculate();
		square.square(7);

		Calculate mul = new Calculate();
		mul.multiplication(5, 6);
		
		Calculate div=new Calculate();
		div.Division(18, 6);
		

	}

}
