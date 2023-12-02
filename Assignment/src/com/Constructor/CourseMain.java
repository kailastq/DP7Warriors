package com.Constructor;

public class CourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1=new Course(100, "Typing");
		Course c2=new Course(101, "Tally");
		
		SubCourse s1=new SubCourse(200, "EnglishTyping");
		SubCourse s2=new SubCourse(201, "MarathiTyping");
		
		System.out.println(c1.id+" "+c1.name);
		System.out.println(c2.id+" "+c2.name);
		
		System.out.println("-------------------------------");
		
		System.out.println(s1.subCourseId+" "+s1.subCourseName);
		System.out.println(s2.subCourseId+" "+s2.subCourseName);
	}

}
