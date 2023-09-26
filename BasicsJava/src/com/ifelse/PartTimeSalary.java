package com.ifelse;

import java.util.Scanner;

public class PartTimeSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of Hours: ");
		int hour=sc.nextInt();
		long salary= 0;

		{
			if(hour<=24)
			{
				salary= 100*hour*365;
			}
			System.out.println("You will get the salary: "+salary);
		}
		
		
		
		
		
		{
			
		}

	}

}
