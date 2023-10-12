package com.ArrayContainment;

import java.util.Arrays;

public class StudentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1=new Course(100, "Java", 35000);
		Course c2=new Course(101, "Python", 40000);
		
		Student stud[]=new Student[4];
		
		stud[0]=new Student(1, "Kailash" ,c1);
		stud[1]=new Student(2, "Pawan" ,c2);
		stud[2]=new Student(3, "Anuj" ,c2);
		
		// hard code getter setter 
		stud[3]=new Student();
		stud[3].setId(4);
		stud[3].setName("Shiv");
		stud[3].setCourse(c1);
		
		for(Student s:stud)
		{
			System.out.println(s);
		}

		System.out.println(Arrays.toString(stud));

		

	}

}
