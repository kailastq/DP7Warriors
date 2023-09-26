package com.looplogic;
import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=sc.nextInt();
		int square=num*num;
		int count=0;
		int temp=num;
		int pow=1;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		for(int i=1;i<=count;i++)	
		{
			pow=pow*10;
		}
		
		if(square%pow==num)
			System.out.println("It is Automorphic");
			else
			System.out.println("It  is not Automorphic");
			

	
	
	
	}

}
