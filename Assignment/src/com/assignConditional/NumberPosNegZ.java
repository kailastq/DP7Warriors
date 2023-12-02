// Write a Java program to check whether a number is negative, positive or zero

package com.assignConditional;
import java.util.Scanner;

public class NumberPosNegZ {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		if(num<0)
		{
			System.out.println(" It is Negative number..");
		}
		else if(num==0)
		{
			System.out.println("Zero..");
		}
		else if(num>0)
		{
			System.out.println("It is Positive number..");
		}
		else
		{
			System.out.println("...");
		}
		
		

	}

}
