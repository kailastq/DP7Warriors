//WAP to create a class Employee with (name, designation and age).Now create and add Employee
//objects elements to Arraylist. Print ArrayList

package com.comparable;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String designation;
	private int age;
	private String state;
	private String country;
	
	Employee(){
		
	}

	public Employee(int id, String name, String designation, int age, String state, String country) {
		super();
		this.id=id;
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.state=state;
		this.country=country;
		
		
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age + ", state="
				+ state + ", country=" + country + "]";
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int compareTo(Employee e) {
//		// TODO Auto-generated method stub
//		if(this.getAge()==e.getAge())
//			return this.getName().compareTo(e.getName());
//		if(this.getAge()>e.getAge())
//			return 1;
//		else
//			return -1;
//	}

//	@Override
//	public int compareTo(Employee e) {
//		// TODO Auto-generated method stub
//		if(this.id < e.id)
//			return -1;
//		else
//			if(this.id > e.id)
//				return 1;
//			else
//				return 0;
				
//	}
	
//	@Override
//	public int compareTo(Employee e) {
//		// TODO Auto-generated method stub
//	if(this.id > e.id)
//		return -1;
//		else
//			if(this.id > e.id)
//				return 1;
//			else
//			return 0;
//				
//}
	
	

}
