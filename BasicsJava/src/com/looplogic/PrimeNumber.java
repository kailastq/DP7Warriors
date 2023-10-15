package com.looplogic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:  ");
		int num=sc.nextInt();
		
		int temp=0;
		
		for(int i=2; i<num;i++)
		{
			if(num%i==0)
			{
				//temp=temp+1
				temp+=1;
			}
		}
		if(temp>0)
		{
			System.out.println("it is not a prime");
		}
		else
		{
			System.out.println("it is prime number");
		}

	}

}
