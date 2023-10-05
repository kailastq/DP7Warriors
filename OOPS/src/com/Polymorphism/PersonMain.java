package com.Polymorphism;

class Person {
	void activity(String name, String Friend) {
		System.out.println(name + " is going to ride with his Friend " + Friend);
	}

	void activity(int salary) {
		System.out.println("His Monthly Salary is: " + salary);
		System.out.println("His annual package is: " + (salary * 12));
	}

	void activity(String Hobby) {
		System.out.println("His favourite activity is:" + Hobby);
	}

}

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.activity(50000);
		
		Person p2=new Person();
		p2.activity("Kailash", "Vishal");
		
		Person p3=new Person();
		p3.activity("Trekking");
		
		
		

	}

}
