package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CourseHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student, Course> chm=new HashMap<>();
		
		Course c1=new Course(1, "Python", 6500);
		Course c2=new Course(1, "Python", 6500);
		
		chm.put(new Student(100, "Kailash", 55), c1);
		chm.put(new Student(101, "Vishal", 75), c2);
		chm.put(new Student(102, "Hrishi", 85), c1);
		chm.put(new Student(103, "Suraj", 65), c2);
		
		for(Map.Entry<Student, Course> c: chm.entrySet())
		{
			System.out.println("Student Details: "+c.getKey());
			
			System.out.println("Course Details: "+c.getValue());
			System.out.println("------------------------------------------------");
		}
		

	}

}
