package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> as1=new ArrayList<>();
		
		as1.add(new Student(5, "Kailash",23));
		as1.add(new Student(6, "Vishal",26));
		as1.add(new Student(9, "Anuj",24));
		as1.add(new Student(5, "Aniket",21));
		
		for(Student s:as1)
		{
			System.out.println(s);
		}
		
		Collections.sort(as1, new RollNoComparator());
		System.out.println("=============================");

//		Collections.sort(as1, new AgeComparator());
//		System.out.println("=============================");

//		Collections.sort(as1, new NameComparator());
//		System.out.println("=============================");

		for(Student s:as1)
		{
			System.out.println(s);
		}

		
	}

}
