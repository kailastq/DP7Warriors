package com.factoryMethodPattern;

public abstract class Developer {
	
	String name;
	float salary;
	int noOfhrs;
	
	Developer(){
		
	}
	
	Developer(String name)
	{
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void salaryPaid();
	
	public abstract void skillSet();
	
	public void workingHours()
	{
		noOfhrs=8;
	}

}
