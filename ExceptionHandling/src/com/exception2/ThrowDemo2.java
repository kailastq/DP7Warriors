package com.exception2;

import java.util.Scanner;

public class ThrowDemo2 {

	static Scanner sc = new Scanner(System.in);

	static void enterDetails() {
		System.out.println("Enter name: ");
		String name = sc.next();

		System.out.println("Enter Marks: ");
		try {
			int marks = sc.nextInt();
			if (marks < 0) {
				throw new RuntimeException("Marks should be greater then 0");
			} else {
				if (marks >= 40) {
					System.out.println(name + " has Passed..!");
				} else {
					System.out.println(name + " has Failed..!");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		enterDetails();

	}

}
