package com.Forloops;
import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count=1;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(" It is Prime Number..");
		}
		else
		{
			System.out.println(" It is not Prime Number..");
		}

	}

}
