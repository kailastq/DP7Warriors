package com.Example;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee employee1 = new Employee(1, "Akash", 80000);
	        Employee employee2 = new Employee(2, "Kailash", 60000);
	        Employee employee3 = new Employee(3, "Shiv", 45000);

	        Employee[] employees = {employee1, employee2, employee3};

	        Employee.findHighestPaidEmployee(employees);
	        Employee.sortEmployeesBySalaryDesc(employees);

	}

}
