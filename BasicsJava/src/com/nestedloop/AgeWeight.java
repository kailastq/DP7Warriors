package com.nestedloop;

import java.util.Scanner;

public class AgeWeight {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		System.out.println("Enter your Weight: ");
		int weight = sc.nextInt();

		if (age > 18) {
			if (weight >= 60) {
				System.out.println(" You are Eligible to donate blood..");
			} else {
				System.out.println(" No, You are Underweight So you can't Donate blood..");
			}
		} else {
			System.out.println(" Sorry, You are not Eligible..!");
		}

	}

}
