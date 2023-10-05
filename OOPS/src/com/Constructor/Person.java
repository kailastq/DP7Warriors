package com.Constructor;

public class Person {

	int id;
	String name;
	int age;

	Person() {

		this(101);
		System.out.println("Default Constructor...");
	}

	Person(int id) {
		this("Kailash", 26);
		this.id = id;
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return (id + " " + name + " " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println(p);

	}

}
