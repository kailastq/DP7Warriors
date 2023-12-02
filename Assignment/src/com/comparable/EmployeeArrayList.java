package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> a1 = new ArrayList<>();
		
		a1.add(new Employee(100, "Kailash", "HR", 28,"Maharashtra", "India"));
		a1.add(new Employee(103, "Vishal", "Support", 24, "SanFrancisco", "America"));
		a1.add(new Employee(101, "Anuj", "Developer", 30, "Karnataka", "India"));
		a1.add(new Employee(102, "Hrishi", "BPO", 38, "Chicago", "America"));
		
		
		for(Employee e: a1)
		{
			System.out.println(e);
		}
		
		Collections.sort(a1);
		System.out.println("--------------------------------------");
		
		for(Employee e: a1)
		{
			System.out.println(e);
		}
		
		
				
		
		

		
	}

}
