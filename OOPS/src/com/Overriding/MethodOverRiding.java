package com.Overriding;

class Person{
	
	void display() {
		System.out.println("I am a Person");
	}
}
class Employee extends Person{
	
	@Override
	void display() {
		//super.display();
		System.out.println("I am an Employee");
	}
}
class Celebrity extends Person{
	@Override
	void display() {
		// super.display();
		System.out.println("I am a Celebrity");
	}
	
}
public class MethodOverRiding{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Person p=new Person();
	p.display();
	
	Employee e=new Employee();
	e.display();
	
	Celebrity c=new Celebrity();
	c.display();

	}

}
