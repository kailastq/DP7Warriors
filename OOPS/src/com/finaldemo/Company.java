package com.finaldemo;

//  final: restrict the user 

// variable, method and class

//final and static : intialization or static block: common for all objects
//final and instance : constructor( in all), instance , separate for all objects
class Developer{
	
	String ename;
	final float salary;
	final static int noofHours;
	final String cname;
	
	static {
		noofHours=8;
	}
	{
		cname="Google";
	}
	public Developer() {
		salary=10000.0f;
	}
	
	public Developer(String ename, float salary) {
		this.ename=ename;
		this.salary=salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}
	final void skills() {
		System.out.println("HTML, CSS, C, C++, Java");
	}
	
	class FullstackDeveloper extends Developer {
		// cannot override it and change it implementation 
		// void skills()
		// {
		//		sysout ("Angular, React, SpringBoot");
		//}
	}
	
}

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d= new Developer();
		System.out.println(d.cname+ " "+ d.ename+" "+d.salary);
		
		d.setEname("Kailash");
		
		System.out.println(d.cname+" "+d.ename+" "+d.salary);
		
		Developer d1=new Developer("Shiv", 25000f);
		
		System.out.println(d1.cname+" "+d1.ename+" "+d1.salary);
		
		// d1.salary=67000f;
		
		//no setter for final variable
		// must be initialized while creating the object 

	}

}
