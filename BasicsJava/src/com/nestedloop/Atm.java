package com.nestedloop;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to HDFC Atm..!");
		double balance= 10000;
		int pin = 5698;
		System.out.println("Enter the Pin:");
		int Pin=sc.nextInt();
		
		

		if (pin == Pin) 
		{
			System.out.println(" Deposit ");
			System.out.println(" Withdraw ");
			System.out.println(" Check Balance ");
			System.out.println(" Cancel ");
		} 
		else
		{
			System.out.println("Sorry You Enter the wrong Pin..!");
		}

	}

}
