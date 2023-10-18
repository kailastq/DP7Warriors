package com.exception1;

import java.util.Scanner;

public class VotingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		try
		{
			int age;
			System.out.println("Enter age: ");
			age = sc.nextInt();
		
		if(age>18)
		{
			System.out.println("You can vote ");
			
		}
		else
		{
			System.out.println("You cannot vote");
		}

	}
	
	catch (Exception e)
	{
		System.out.println(e+"- Age entered was not in number");
	}
		
	finally
	{
		sc.close();
		System.out.println("Thanks for voting.........");
	}

}
}
