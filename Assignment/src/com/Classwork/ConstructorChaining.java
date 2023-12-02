package com.Classwork;

class Employee {
	int id;
	String name;
	float salary;
	int experience;

	Employee() {
		System.out.println("It is Default constructor ");
	}

	Employee(int id, String name) {
		
		
		System.out.println("1st Parametrized Constructor");
		this.id = id;
		this.name = name;

	}

	Employee(float salary, int experience) {
		
		
		System.out.println("2nd Parametrized  Constructor");
		this.salary = salary;
		this.experience = experience;

	}

	public String toString() {
		return "\nId: " + id + "\nName: " + name + "\nMonthly Salary: " + salary + "\nExperience: " + experience;
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		System.out.println(e1);
		Employee e2 = new Employee(100, "Kailash");
		System.out.println(e2);
		Employee e3 = new Employee(45000f, 6);
		System.out.println(e3);

	}

}
