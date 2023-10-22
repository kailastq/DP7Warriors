package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> elist=new ArrayList<>();
		
		elist.add(new Employee(100, "Kailash",55000));
		elist.add(new Employee(101, "Vishal",75000));
		elist.add(new Employee(102, "Pawan",50000));
		elist.add(new Employee(103, "Aniket",45000));
		elist.add(new Employee(104, "Ashish",55000));
		elist.add(new Employee(105, "Mangesh",60000));
		
		//System.out.println(elist);
		
		for(Employee e:elist)
		{
			System.out.println(e);
		}
		
		System.out.println("------------------------------");
		Collections.sort(elist);
		
		for(Employee e:elist)
		{
			System.out.println(e);
		}
		
		
		

	}

}
