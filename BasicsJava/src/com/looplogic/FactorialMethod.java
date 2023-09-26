package com.looplogic;
import java.util.Scanner;

public class FactorialMethod {
	static int factorial (int num) {
	
	int fact=1;
	for(int i=1; i<=num;i++)
	{
		fact*=i;
	}
	return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		//factorial(n);
		
		System.out.println("The Factorial of given number is:"+factorial(n));

	}

}
