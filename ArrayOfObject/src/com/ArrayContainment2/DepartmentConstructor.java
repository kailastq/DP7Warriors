package com.ArrayContainment2;

import java.util.Scanner;

public class DepartmentConstructor {
	
	static Scanner sc=new Scanner(System.in);

	static void displayCount(Employee e[], Department department[]) 
	{
		int count;
		for (Department d : department) {
			count = 0;
			for (Employee e1 : e) {
				if (e1.getDepartment().equals(d)) {
					count++;
				}
			}
			System.out.println(d+": " + count);
		}
	}
	
	static void displayDetails(Employee e[], Department department[]) {
		
		for(Department d: department) {
			for (Employee e1:e) {
				if(e1.getDepartment().equals(d))
				{
					System.out.println(d.getName()+": "+e1.getName());
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department d[] = new Department[3];

		d[0] = new Department(1, "Marketing");
		d[1] = new Department(1, "Finance");
		d[2] = new Department(1, "Development");

		Employee emp[] = new Employee[6];
		emp[0] = new Employee(100, "Kailash", 55000, d[1]);
		emp[1] = new Employee(200, "Pawan", 45000, d[1]);
		emp[2] = new Employee(300, "Aniket", 35000, d[2]);
		emp[3] = new Employee(400, "Anuj", 40000, d[0]);
		emp[4]=new Employee(500, "Rohit",65000, d[2]);
		emp[5]=new Employee(600, "Mangesh",75000, d[1]);

		displayCount(emp, d);
		
		System.out.println("==========================");
		
		displayDetails(emp,d);
		
	}

}
