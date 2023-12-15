package com.factoryMethodPattern;

import java.util.Arrays;

public class PythonDeveloper extends Developer{
	
	public PythonDeveloper() {
		
	}
	
	public PythonDeveloper(String name)
	{
		super(name);
	}

	@Override
	public void salaryPaid() {
		// TODO Auto-generated method stub
		salary=45000f;
		
	}

	@Override
	public void skillSet() {
		// TODO Auto-generated method stub
		String skills[]= {"Basic Python", "Numpy", "Machine Learning"};
		System.out.println(Arrays.toString(skills));
		
	}

}
