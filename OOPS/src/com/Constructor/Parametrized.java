package com.Constructor;

class Student {

	private int id;
	private String name;
	private int age;
	
	Student()
	{
		
	}
// Parameterized 
	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	 

	public String toString() {
		return id + " " + name + " " + age;

	}
}

	public class Parametrized {
		public static void main(String[] args) {
			Student s1 = new Student(101, "Kailash", 23);
			Student s2 = new Student(102, "Pawan", 24);
			Student s3 = new Student(103, "Sharayu", 25);

			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);

		}

	}

