package com.Static;

class Student1 {

	private int id;
	String name;
	float marks;
	static String scname; // First loaded
	static int count = 0;

	Student1() {
		scname = "MPHS";

	}

	Student1(int id, String name, float marks) {
		this();
		this.id = id;
		this.name = name;
		this.marks = marks;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;

	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String toString() {
		return id + " " + name + " " + marks;
	}

}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		System.out.println(s1.scname);

		Student1 s2 = new Student1();
		System.out.println(s2.scname);

	}

}
