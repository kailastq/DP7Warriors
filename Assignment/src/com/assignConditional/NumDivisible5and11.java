//Write a Java program to check whether a number is divisible by 5 and 11 or not 

package com.assignConditional;

import java.util.Scanner;

public class NumDivisible5and11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int Number= sc.nextInt();
		
		if(Number%5==0  && Number%11==0)
		{
			System.out.println(Number+ "  is divisible ..");
		}
		else
		{
			System.out.println(Number+ " is not divisible..");
		}
		
		
	}

}
