package com.Containment;

public class CarDriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("X7", "BMW", 750000f);
		Car c2=new Car("PHAMTOM", "ROLLS ROYCE", 990000f);
		Car c3=new Car("Q8", "AUDI", 900000f);
		
		CarDriver d1=new CarDriver(200, "Aniket", c1);
		CarDriver d2=new CarDriver(300, "Anuj", c2);
		CarDriver d3=new CarDriver(100, "Kailash", c3);
		
		System.out.println(d1);
		System.out.println("-------------------------------");
		System.out.println(d2);
		System.out.println("-------------------------------");
		System.out.println(d3);
	}

}
