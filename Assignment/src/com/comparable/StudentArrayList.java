package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {

	public static void main(String[] args) {

		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(new Student(101, "dipti", 78.5f));
		al1.add(new Student(102, "Anuj", 80.4f));
		al1.add(new Student(103, "pratiksha", 90.5f));
		al1.add(new Student(104, "kailash", 75.8f));
		al1.add(new Student(105, "pralay", 60.5f));

		for (Student s : al1) {
			System.out.println(s.getName() + " " + s.getMarks());

			System.out.println(s);

		}
		System.out.println("------------");
		Collections.sort(al1);

		for (Student s : al1) {
			System.out.println(s);

		}
	}

}
