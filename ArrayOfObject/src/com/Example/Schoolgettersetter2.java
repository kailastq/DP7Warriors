package com.Example;

import java.util.Scanner;

public class Schoolgettersetter2 {
	
	static Scanner sc=new Scanner(System.in);
	
	static void enterDetails(Student s)
	{
		System.out.println("Enter student id: ");
		s.setId(sc.nextInt());
		
		System.out.println("Enter Name: ");
		s.setName(sc.next());
		
		System.out.println("Enter the Marks: ");
		s.setMarks(sc.nextFloat());
	}
	
	static void printDetails(Student str[])
	{
		System.out.println("------------------------------------------------------");
		for(Student s:str)
		{
			System.out.println(s);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		Student st[]=new Student[3];
		
		for(int i=0; i<st.length;i++)
		{
			st[i]=new Student();
			enterDetails(st[i]);
			
		}
		printDetails(st);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
