package com.looplogic;

import java.util.Scanner;

public class NoofDigitMethodApproach {
	
	static void showUser(int num) {
		
		int count=0;
		while(num>0)
		{
			int r=num%10;
			count++;
			num=num/10;
		}
		System.out.println("The number of digit in given number is:  "+count);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		showUser(num);

	}

}
