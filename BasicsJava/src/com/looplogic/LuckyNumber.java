package com.looplogic;

import java.util.Scanner;

public class LuckyNumber {

	static int luckyNumber(int num, int luckyn) {

		int count = 0;
		while (num != 0) {
			int r = num % 10;
			if (luckyn == r)
				count++;
			num = num / 10;
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Car Number: ");
		int n = sc.nextInt();
		System.out.println("Enter the Lucknumber is: ");
		int luckyno = sc.nextInt();

		System.out.println(luckyNumber(n, luckyno));

	}

}
