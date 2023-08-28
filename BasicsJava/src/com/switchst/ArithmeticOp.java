package com.switchst;

import java.util.Scanner;

public class ArithmeticOp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("Enter your choice:");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case '+':
			System.out.println("Addition is: "+ (num1+num2));
			break;
			
		case '-':
			System.out.println("Subtraction is: "+ (num1-num2));
			break;
			
		case '*':
			System.out.println("Multiplication is: "+(num1*num2));
			break;
			
		case '/':
			System.out.println("Division is:"+ (num1/num2));
			break;
			
			
			default: 
				System.out.println("Error..");
		}
		
		
		

	}

}
