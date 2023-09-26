package com.looplogic;

import java.util.Scanner;

class Checkno {

	void checkno(int num) {

		int originalno = num;
		int count = 0;
		int pow = 1;

		while (num != 0) {
			count++;
			num /= 10;

		}

		System.out.println("The count of digit is: " + count);
		for (int i = 1; i <= count / 2; i++) {
			pow = pow * 10;

		}

		if (count%2 == 0) {
			int num1 = originalno / pow;
			int num2 = originalno % pow;
			int sum = num1 + num2;

			System.out.println("Sum of number is: " + sum);
			int square = sum * sum;
			System.out.println("Square of sum of two Halves is: " + square);
			if (square == originalno) 
			{
				System.out.println(originalno + " is tech number: ");
			}
			else
			{
				System.out.println(originalno + " is not a tech number");
			}
		}
	}
}

public class TechNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Checkno c1 = new Checkno();
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		c1.checkno(num);

	}

}