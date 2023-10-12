package com.ArrayContainment2;

import java.util.Scanner;

public class EmployeeGetterSetter {

	static Scanner sc = new Scanner(System.in);

	static void enterDetails(Employee e) {
		System.out.println("Enter Employee Id: ");
		e.setId(sc.nextInt());

		System.out.println("Enter Employee Name: ");
		e.setName(sc.next());

		System.out.println("Enter Employee Salary: ");
		e.setSalary(sc.nextDouble());

		e.setDepartment(new Department());
		System.out.println("Enter Department Id: ");
		e.getDepartment().setId(sc.nextInt());

		System.out.println("Enter Department Name: ");
		e.getDepartment().setName(sc.next());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp[] = new Employee[2];

		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();
			enterDetails(emp[i]);

		}

		for (Employee e : emp) {
			System.out.println(e);
		}

	}

}
