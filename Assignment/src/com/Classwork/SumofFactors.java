package com.Classwork;

import java.util.Scanner;

public class SumofFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<num;i++)
		{
			if(num%i==0) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		
		System.out.println("The sum of all the factors of given number is: "+sum);
	}

}
