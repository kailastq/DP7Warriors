package com.nestedloop;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Character: ");
		char ch=sc.next().charAt(0);
		
		if(ch=='a' ||  ch=='e'  ||  ch=='i'  ||  ch=='o'  ||  ch=='u' || ch=='A' ||  ch=='E'  ||  ch=='I'  ||  ch=='O'  ||  ch=='U') 
			{
				System.out.println("It is Vowel");
			}
			else
			{
				System.out.println("It is Consonant");
			}
		}
		}
			