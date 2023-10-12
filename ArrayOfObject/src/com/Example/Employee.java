package com.Example;

public class Employee {

	public int id;
	public String name;
	public double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void findHighestPaidEmployee(Employee[] employees) {
		Employee highestPaid = employees[0];
		for (Employee emp : employees) {
			if (emp.salary > highestPaid.salary) {
				highestPaid = emp;
			}
		}
		System.out.println("Highest Paid Employee: " + highestPaid.name + " (Salary: $" + highestPaid.salary + ")");
	}

	public static void sortEmployeesBySalaryDesc(Employee[] employees) {
		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].salary < employees[j].salary) {
					Employee temp = employees[i];
					employees[i] = employees[j];
					employees[j] = temp;
				}
			}
		}
		System.out.println("Employees Sorted by Salary (Descending Order):");
		for (Employee emp : employees) {
			System.out.println(emp.name + " (Salary: $" + emp.salary + ")");
		}
	}
}
