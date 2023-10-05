package com.Containment;

public class TransportMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e1=new Engine("Diesel", 2020, 500000);
		Engine e2=new Engine("Petrol", 2015, 300000);
		
		Machine m1=new Machine("Automatic", e1);
		Machine m2=new Machine("Manual", e2);
		
		Truck t1=new Truck(2020, "Scania", m1);
		Truck t2=new Truck(2023, "Tata", m2);
		
		System.out.println(t1);
		System.out.println("------------------------------");
		System.out.println(t2);
	}

}
