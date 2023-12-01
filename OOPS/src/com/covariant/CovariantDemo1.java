package com.covariant;

class Person {
	int id;
	String name;
	
	
	Person(){
		
	}
	
	Person(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	Person showDetails() {
		name=name+" - India";
		return this;
	} 
	
	public String display() {
		return "ID: "+id+"Name:  "+name;
	}
	}

class Employee extends Person
{
	float salary;
	
	Employee()
	{
		
	}
	
	
	Employee(int id, String name, float salary)
	{
		super(id, name);
		this.salary=salary;
	}
	
//	Person showDetails() {
//		name=name+" : ThinkQ";
//		salary=salary+1000;
//		return this;
//	}
	
	Employee showDetails() {
		name=name+" -ThinkQ";
		salary=salary+1000;
		return this;
	}
	public String show() {
		return "ID:"+id+"Name: "+name+"Salary: "+salary;
	}
}

public class CovariantDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person ref;
		Employee eref;
		
		Person p=new Person(100, "Kailash");
		ref=p.showDetails();
		// System.out.println(p.showDetails());
		System.out.println(ref.display());
		
		Employee e=new Employee(1001, "Vishal", 45000f);
		ref=e.showDetails();
		// System.out.println(e.showDetails());
		System.out.println(ref.display());
		
		
		Employee e1=new Employee(1002, "Pawan", 55000f);
		eref= e.showDetails();
		System.out.println(eref.show());
	}

}
