package com.Containment;

import java.util.Scanner;

public class MycollegeUserInput {

	static Scanner sc = new Scanner(System.in);

	void EnterStudentDetails(Student s)
	{
		System.out.println("Enter student id: ");
		s.setSid(sc.nextInt());

		System.out.println("Enter Student name: ");
		s.setName(sc.next());

		s.setCourse(new Course());

		System.out.println("Enter the Course id: ");
		s.getCourse(). setCid(sc.nextInt());

		System.out.println("Enter the Course name: ");
		s.getCourse().setCname(sc.next());

		System.out.println("Enter the Fees: ");
		s.getCourse().setFees(sc.nextFloat());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MycollegeUserInput college = new MycollegeUserInput();
		Student s1 = new Student();
		Student s2 = new Student();
		college.EnterStudentDetails(s1);
		college.EnterStudentDetails(s2);

		System.out.println(s1);
		System.out.println(s2);

	}

}
