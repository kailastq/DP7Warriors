package com.Static;

class Employee {
	private int id;
	private String name;
	private double salary;
	static String CompanyName;
	static int count = 0;

	static {
		CompanyName = "Vistara";
	}
	{
		count++;
	}

	static void changeName(String name) {
		CompanyName = name;
	}

	Employee() {

	}

	Employee(int id, String name, double salary) {
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setCompanyName(String CompanyName) {
		Employee.CompanyName = CompanyName;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public String toString() {
		return id + " " + name + " " + salary;
	}
}

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CompanyName:" + Employee.CompanyName);
		System.out.println("Number of Employees:" + Employee.count);

		Employee e1 = new Employee(100, "Kailash", 6000);
		Employee e2 = new Employee(200, "Vishal", 3000);
		Employee e3 = new Employee(300, "Rushi", 9000);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		System.out.println("Number of Employees: " + Employee.count);

		Employee.changeName("Air India");

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
