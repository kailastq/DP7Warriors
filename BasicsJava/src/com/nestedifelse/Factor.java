package com.nestedifelse;

import java . util.Scanner; 

public class Factor {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		System.out.println("Enter the factor: ");
		int factor=sc.nextInt();
		
		if(num%factor==0)
		{
			System.out.println(factor+ " is a "+num+ " s factor" );
		}
		else
		{
			System.out.println(factor+ " is a not "+num+ " s factor");
		}

	}

}
