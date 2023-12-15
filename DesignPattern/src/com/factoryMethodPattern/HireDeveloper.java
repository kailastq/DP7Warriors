package com.factoryMethodPattern;

import java.util.Scanner;

public class HireDeveloper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the developer to hire(Java, Python, Fullstack): ");
		String dtype=sc.next();
		
		GetDeveloper gd=new GetDeveloper();
		
		Developer d=gd.getDeveloper(dtype);
		
		if(d==null)
		{
			System.out.println("Developer not found...");
		}
		else
		{
			System.out.println("---------------------------------------");
			System.out.println("Enter Employee Name: ");
			
			d.setName(sc.next());
			
			System.out.println("=======================");
			
			
			System.out.println("Welcome to our company:"+d.getName());
			d.salaryPaid();
			System.out.println("Salary paid:"+d.salary);
			d.workingHours();
			System.out.println("Number of working hours:"+d.noOfhrs);
			
			System.out.println("Skill set:");
			d.skillSet();
			
			System.out.println("============================================");
			
			
		}
		

	}

}
