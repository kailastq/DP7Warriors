package com.ArrayContainment;

import java.util.Scanner;

public class StudentGetterSetter {
	
	static Scanner sc= new Scanner(System.in);
		
	static void enterDetails(Student s)
	{
		System.out.println("Enter student id:");
		s.setId(sc.nextInt());
		
		System.out.println("Enter name:");
		s.setName(sc.next());
		
		// 1st way
//		Course c= new Course();
//		
//		System.out.println("Enter course id:");
//		c.setCid(sc.nextInt());
//		
//		System.out.println("Enter course name");
//		c.setName(sc.next());
//		
//		System.out.println("Enter course fees:");
//		c.setFees(sc.nextDouble());
//		
//		s.setCourse(c);
		
		// 2nd way
		
		s.setCourse(new Course());
		
		System.out.println("Enter course id:");
		
		s.getCourse().setId(sc.nextInt());
		
		System.out.println("Enter course name");
		
		s.getCourse().setName(sc.next());
		
		System.out.println("Enter course fees:");
		
		s.getCourse().setFees(sc.nextDouble());
		
			
	}
	
	static void printDetails(Student []st)
	{
		for(Student s:st)
		{
			System.out.println(s);
		}
	}

	
	public static void main(String[] args) {
		
		Student stud[]=new Student[3];
		
		for(int i=0;i<stud.length;i++)
		{
			stud[i]= new Student();
			enterDetails(stud[i]);
		}
		
		System.out.println("------------------------------------------------------");
		
		printDetails(stud);
		
	}
}
