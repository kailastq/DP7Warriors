package com.customException;

import java.util.Scanner;

public class NameAccept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name: ");
		String name=sc.next();
		
		try
		{
			if(name.length()<3)
			{
				throw new InvalidNameException("Name  should be greater than 2 character");
			}
			
			System.out.println("Welcome "+ name);
		}
		catch(InvalidNameException e)
		{
			System.out.println(e);
		}
		

	}

}
