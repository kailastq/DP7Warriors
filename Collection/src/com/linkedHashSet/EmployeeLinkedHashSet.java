package com.linkedHashSet;

import java.util.LinkedHashSet;

public class EmployeeLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Employee> hs=new LinkedHashSet<>();
		
		hs.add(new Employee(100, "Kailash", 65000f));
		hs.add(new Employee(101, "Vishal", 68000f));
		hs.add(new Employee(102, "Anuj", 70000f));
		hs.add(new Employee(100, "Kailash", 65000f));
		
		for(Employee e:hs)
		{
			System.out.println(e);
		}
		
	}

}
