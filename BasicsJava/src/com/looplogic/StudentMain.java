package com.looplogic;

import java.util.Scanner;

class Student1 {

	private int studentid;
	private String studentName;
	private String studentAddress;
	private String collegename;

	Student1(int studentid, String studentName, String studentAddress) {
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegename = "TQ";

	}

	Student1(int studentid, String studentName, String studentAddress, String collegename)

	{
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegename = collegename;

	}

	public int getStudentid() {
		return studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public String getCollegename() {
		return collegename;
	}

}


public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();

		Student1 s1 = null;
		if (choice == 1) {

			System.out.println("Enter studentid ");
			int studentid = sc.nextInt();
			System.out.println("Enter Name ");
			String studentName = sc.next();
			System.out.println("Enter Address ");
			String studentAddress = sc.next();

			s1 = new Student1(studentid, studentName, studentAddress);
		}
		else if (choice == 0) 
		{
			System.out.println("Enter studentid");
			int studentid = sc.nextInt();
			System.out.println("Enter Name");
			String studentName = sc.next();
			System.out.println("Enter Address");
			String studentAddress = sc.next();
			System.out.println("Enter college name");
			String collegename = sc.next();

			s1 = new Student1(studentid, studentName, studentAddress, collegename);

		} else {
			System.out.println("Error..! Please Enter Again");

		}
		System.out.println("Studentid :" + s1.getStudentid());
		System.out.println("Studentname :" + s1.getStudentName());
		System.out.println("StudentAddress :" + s1.getStudentAddress());
		System.out.println("Studentcollegename :" + s1.getCollegename());

	}

}