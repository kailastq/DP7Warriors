package com.factoryMethodPattern;

import java.util.Arrays;

public class FullStackDeveloper extends Developer{
	
	public FullStackDeveloper() {
		
	}
	
	public FullStackDeveloper(String name)
	{
		super(name);
	}

	@Override
	public void salaryPaid() {
		// TODO Auto-generated method stub
		salary=105000f;
		
	}

	@Override
	public void skillSet() {
		// TODO Auto-generated method stub
		String skills[]= {"Java", "Python", "AWS","ReactJS"};
		System.out.println(Arrays.toString(skills));
		
	}

}
