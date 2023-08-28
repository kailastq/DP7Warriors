package com.operator;

import java.util.Scanner;

public class PersonInfo {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Enter your height:");
		float height = sc.nextFloat();
		System.out.println("Enter your gender:");
		String gender = sc.next();
		System.out.println("Enter your Age:");
		int age = sc.nextInt();
		
		System.out.println(" name  " +name+ " height  "+height+" gender is  "+ gender+  "  age " +age);
		sc.close();

	}

}
