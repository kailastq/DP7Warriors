package com.looplogic;

import java.util.Scanner;

public class ReverseRelation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		int result;
		while (temp != 0) {
			int r = temp % 10;
			rev = rev * 10 + r;
			temp = temp / 10;
		}
		result = num - rev;
		if (result == 0 || result < 0)
		{
			System.out.println("The result of given number is 0");
		} 
		else
			System.out.println("The result is: " + result);
	}

}