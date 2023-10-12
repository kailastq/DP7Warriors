package com.ArrayContainment;

import java.util.Arrays;

public class StudentConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stud[]= new Student[4];
		
		stud[0]= new Student(1,"Rohit",new Course(101,"Java",34000));
		stud[1]= new Student(2,"Shivam", new Course(102,".net",35000));
		stud[2]= new Student(3,"Dipak", new Course(102,".net",45000));
		
		// hard code getter setter
		
		stud[3]= new Student();
		stud[3].setId(4);
		stud[3].setName("Vishal");
		stud[3].setCourse(new Course(101,"Java",34000));
		
		for(Student s:stud)
		{
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(stud));
		
		
	}

}
