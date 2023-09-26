package com.looplogic;

import java.util.Scanner;

public class IncreasingDecreasingBouncy {

	public static boolean Increasing(int num) {

		int temp = num;
		boolean flag = true;
		int r = temp % 10;
		temp /= 10;
		while (temp != 0) {
			int r1 = temp % 10;
			if (r1 > r) {
				flag = false;
				break;
			}
			temp = temp / 10;
		}
		return flag;
	}

	public static boolean Decreasing(int num) {

		int temp = num;
		boolean flag = true;
		int r = temp % 10;
		temp /= 10;
		while (temp != 0) {

			int r1 = temp % 10;
			if (r1 < r) {
				flag = false;
				break;

			}
			temp /= 10;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		if (Increasing(num)) 
		{
			System.out.println( "it is in Increasing order ");
		}
		else if (Decreasing(num)) 
		{
			System.out.println("It  is in Decreasing order");
		}
		else
			System.out.println("The Number is Bouncy");
	}

}