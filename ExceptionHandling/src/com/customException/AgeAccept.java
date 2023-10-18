package com.customException;

import java.util.Scanner;

public class AgeAccept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		
		try
		{
			if(age<18)
			{
				throw new InvalidAgeException("Age should be greater than 18");
			}
			System.out.println("You are Eligible to vote");
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		

	}

}
