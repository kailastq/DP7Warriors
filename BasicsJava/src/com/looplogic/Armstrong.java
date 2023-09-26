package com.looplogic;

import java.util.Scanner;

public class Armstrong {
	static void armstrong(int num)

{
	int temp=num;
	int sum=0;
	while(num!=0)
	{
		int r=num%10;
		sum+=r*r*r;
		num=num/10;
	}
	if(temp==sum)
	{
		System.out.println("it is armstrong number..");
	}
	else
	{
		System.out.println("it is not armstrong number..");
	}
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		armstrong(num);
		

	}

}
