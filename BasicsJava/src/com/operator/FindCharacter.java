package com.operator;

import  java. util. Scanner;

public class FindCharacter {
	
	public static  void main(String args[]) {
		Scanner  sc = new Scanner (System.in);
		
		System.out.println("Enter the  character");
		char ch= sc.next().charAt(0);
		
		if (ch >= 'a' && ch<= 'z')
		{
			System.out.println("It is small letter.!");
		}
		else if (ch >='0' && ch<='9')
		{
			System.out.println("It is digit.!");
		}
		else if (ch >='A' && ch<='Z')
		{
			System.out.println("It is Capital letter.!");
		}
		else
		{
			System.out.println("It is special character.!");
		}
		sc.close();
	}

}
