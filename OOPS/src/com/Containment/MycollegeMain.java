package com.Containment;

public class MycollegeMain {

	public static void main(String[] args) {
		Course c1=new Course(101,"English",4900f);
		Course c2=new Course(202,"Mechanics",4600f);
		Course c3=new Course(303,"Geography",5300f);
		
		Student s1=new Student(1,"Deep",c1);
		Student s2=new Student(2,"Kailash",c2);
		Student s3=new Student(3,"Pawan",c3);
		
		
		System.out.println(s1);
		System.out.println("-----------------------------------");
		System.out.println(s2);
		System.out.println("------------------------------------");
		System.out.println(s3);
		
		
		
		
		
		

	}

}