package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> slist=new ArrayList<>();
		
		slist.add(new Student(101, "Kailash", 75.5f));
		slist.add(new Student(102, "Anuj", 55.5f));
		slist.add(new Student(103, "Pawan", 65.8f));
		slist.add(new Student(104, "Vishal", 89.5f));
		slist.add(new Student(105, "Ashish", 45.5f));
		slist.add(new Student(106, "Kartik", 78.5f));
		
		//System.out.println(slist);
		
		for(Student s:slist)
		{
		//	System.out.println(s.getName()+"  "+s.getMarks());
			System.out.println(s);
		}
		
		System.out.println("----------------------------------");
		Collections.sort(slist);
		
		for(Student s:slist)
		{
			System.out.println(s);
		}
		

	}

}
