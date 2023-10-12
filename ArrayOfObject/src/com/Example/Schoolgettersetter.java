package com.Example;

import java.util.Scanner;

public class Schoolgettersetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Student st[] = new Student[3];

		for (int i = 0; i < st.length; i++) {
			st[i] = new Student(); // Important Statement

			System.out.println("Enter Student Id: ");
			// int id=sc.nextInt();
			// st[0].setId(id);

			st[i].setId(sc.nextInt());

			System.out.println("Enter Name: ");
			st[i].setName(sc.next());

			System.out.println("Enter Marks: ");
			st[i].setMarks(sc.nextFloat());
		}

		System.out.println("---------------------------------------------------------");

		for (Student s : st) {
			System.out.println(s);
		}

	}

}
