package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> elist = new ArrayList<>();
		
		elist.add(new Employee(1,"Kailash",89000));
		elist.add(new Employee(1,"Kailash",89000));
		elist.add(new Employee(1,"Kailash",90000));
		elist.add(new Employee(1,"Kailash",88000));
		elist.add(new Employee(1,"Kailash",99000));
		
		for(Employee e:elist)
		{
			System.out.println(e);
		}
		
		//Collections.sort(elist, new SalaryComparator());
		
		Collections.sort(elist, new SalaryNameComparator());
		
		System.out.println("---------------------------------------");
		for(Employee e:elist)
		{
			System.out.println(e);
		}
		
		
		

	}

}
