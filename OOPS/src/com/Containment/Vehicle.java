package com.Containment;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("X7", "BMW", 750000f);
		Car c2=new Car("PHAMTOM", "ROLLS ROYCE", 990000f);
		Car c3=new Car("Q8", "AUDI", 900000f);
		
		Driver d1=new Driver(200, "Aniket", c1);
		Driver d2=new Driver(300, "Anuj", c2);
		Driver d3=new Driver(100, "Kailash", c3);
		
		System.out.println(d1);
		System.out.println("-------------------------------");
		System.out.println(d2);
		System.out.println("-------------------------------");
		System.out.println(d3);
	}

}
