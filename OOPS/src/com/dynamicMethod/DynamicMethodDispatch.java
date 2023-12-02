package com.dynamicMethod;

class Person{
	void display() {
		System.out.println("I am a Person");
	}
}

class Employee extends Person{
	 void display() {              // we can make it public, protected and default but we cannot make it private 
		super.display();
		System.out.println("I am an Employee");
	}
	
	void show() {
		System.out.println("Employee is very polite");
	}
}

class Parent  extends Employee{
	void display() {
		System.out.println("Employee is parent of 2 children");
	}
} 

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		p=new Person();
		p.display();
		System.out.println("=================");
		
		Employee e=new Employee();
		e.display();
		System.out.println("=================");

		
		Parent p1=new Parent();
		p1.display();
		System.out.println("=================");

		

	}

}
