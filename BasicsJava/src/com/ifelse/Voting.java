package com.ifelse;

import java.util.Scanner;

public class Voting {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();

		// syntax
		// if(condition)
		// {}

		if (age >= 18) {
			System.out.println("You can vote..");
		} else {
			System.out.println("You cannot vote..");
		}
		System.out.println("Rest of code..");
	}
}
