//Write a Java program to find maximum between three numbers

package com.assignConditional;

import java.util.Scanner;

public class MaximumIn3num {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number: ");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int num3 =sc.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1+" is greater..");
			}
			else
			{
				System.out.println(num2+ " is greater..");
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println(num2+ " is greater..");
			}
			else
			{
				System.out.println(num3+ " is greater..");
			}
		}

	}

}
