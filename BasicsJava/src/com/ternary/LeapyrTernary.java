package com.ternary;

import java.util.Scanner;

public class LeapyrTernary{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year:");
		int year=sc.nextInt();
		
		String S=(year%4==0 && year%100==0 && year%400==0)? "True": "False";
		
		{
			System.out.println(S);
		}
		
		

	}

}
