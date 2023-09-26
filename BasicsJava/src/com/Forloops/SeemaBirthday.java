package com.Forloops;

import java.util.Scanner;

public class SeemaBirthday {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the  Birthday ");
		int year=sc.nextInt();
		int result=0;
		
		for(int i=1; i<=year; i++)
			
		{
			result=year*year*year;
		}
		System.out.println("The number of gold coin seema got at her " + year + " Birthday is: "+result);

	}

}
