package com.factoryMethodPattern;

import java.util.Arrays;

public class JavaDeveloper extends Developer{
	
	public JavaDeveloper() {
		
	}
	
	public JavaDeveloper(String name)
	{
		super(name);
	}

	@Override
	public void salaryPaid() {
		// TODO Auto-generated method stub
		salary=75000f;
		
	}

	@Override
	public void skillSet() {
		// TODO Auto-generated method stub
		String skills[]= {"CoreJava", "SQL", "JDBC"};
		System.out.println(Arrays.toString(skills));
		
	}

}
