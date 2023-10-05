package com.Constructor;

class Vehicle {
	int id;
	String name;
	int price;

	Vehicle() {

	}

	Vehicle(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	void ShowDetails() {
		this.display();
		System.out.println(id+" "+name+" "+price);
				System.out.println("----------------------");
	}
	void display() {
		System.out.println("This is current class object");
	}
}

public class VehicleDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle(100, "Bentley", 500);
		Vehicle v2 = new Vehicle(101, "Ferrari", 1000);
		v1.ShowDetails();
		v2.ShowDetails();

	}

}
