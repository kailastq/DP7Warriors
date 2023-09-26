package com.Forloops;

import java.util.Scanner;

public class FactorialofNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long fact=1;
		
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		
		/*for(int i=num; i>0; i--)
		 * {
		 * fact*=i;
		 * }
		 */
		
		for(int i=1; i<=num;i++)
			fact*=i;
		
		System.out.println("Factorial of number is: "+fact);
		

	}

}
