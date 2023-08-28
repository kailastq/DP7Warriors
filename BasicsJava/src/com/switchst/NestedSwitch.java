package com.switchst;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Your Stream: ");

		String stream = sc.next();
		System.out.print("Enter Percentage: ");
		int passingCriteria = sc.nextInt();

		switch (stream)
		{
		case "MBA":
			System.out.println("You Are Choosing MBA.");
			switch (passingCriteria) 
			{
			case 75:
				System.out.println("You Got 75% For MBA.");
				break;

			case 70:
				System.out.println("You Got 70% For MBA. ");
				break;

			default:
				System.out.println("Better Luck Next Time.");
			}
			break;

		case "MCA":

			System.out.println("You Are Choosing MCA. ");
			switch (passingCriteria) 
			{

			case 75:

				System.out.println("You Got 75% For MCA. ");
				break;

			case 70:
				System.out.println("You Got 70% For MCA. ");
				break;

			default:
				System.out.println("Better Luck next time");
			}

		}
	}
}
