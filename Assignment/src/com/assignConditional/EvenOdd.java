package com.assignConditional;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int num=26;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("It is Even number");
		}
		else
		{
			System.err.println("It is odd number");  
		}

	}

}
