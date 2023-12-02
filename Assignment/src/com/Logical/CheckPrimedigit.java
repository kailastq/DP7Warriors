package com.Logical;

import java.util.Scanner;

public class CheckPrimedigit {
	static void checkprime(int num) {
		int temp=num;
		int rem;
		
		System.out.println("The prime digit in given number is:  ");
		
		while(temp!=0) {
			
			rem=temp%10;
			if(rem%2!=0) 
			{
				System.out.println(rem);
			}
			rem=rem/10;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number: ");
			int num=sc.nextInt();
			
			checkprime(num);
	}

}
