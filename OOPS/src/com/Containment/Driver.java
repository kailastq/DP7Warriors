package com.Containment;

public class Driver {
	private int id;
	private String name;
	private Car car;
	
	Driver()
	{
		
	}
	
	Driver(int id, String name, Car car){
		this.id=id;
		this.name=name;
		this.car=car;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String toString() {
		return "\nDriver id: " + id + "\nName: " + name + "\nCar: " + car;
	}
	
	
	

}
