package com.looplogic;

public class CheckFibonacci {

	void checkFibonaccinumber(int num) {

		int num1 = 0;
		int num2 = 1;
		int number = 0;

		System.out.println(num1 + " " + num2);

		while (number < num) {
			number = num1 + num2;
			num1 = num2;
			num2 = number;

			if (number % 5 != 0) {
				System.out.println(" " + number);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckFibonacci C = new CheckFibonacci();
		C.checkFibonaccinumber(500);
	}

}
