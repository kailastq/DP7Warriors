package com.ArrayListAssign;

import java.util.ArrayList;

public class EmployeeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> emp=new ArrayList<>();
		
		emp.add(new Employee(100, "Kailash", 65000f));
		emp.add(new Employee(101, "Vishal", 75000f));
		
		for(Employee e: emp)
		{
			System.out.println(e);
		}
		
		System.out.println(emp.hashCode());  // it will print memory space hashcode
		
	}

}
