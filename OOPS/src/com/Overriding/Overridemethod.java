package com.Overriding;

class Vehicle {

	void display() {
		System.out.println("Vehicle of  four wheeler or two wheeler");
	}

}

class Twowheeler extends Vehicle {
	public void display() { // we can make public protected and default but we cannot make private we cannot
							// reduce the visibilty of our code
		super.display();
		System.out.println("Two wheeler Vehicle");

	}

}

class Fourwheeler extends Vehicle {
	protected void display() {

		System.out.println("Four wheeler Vehicle");

	}

	void show() {
		System.out.println("Four wheeler");

	}

}

public class Overridemethod {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.display();

		v = new Twowheeler();
		v.display();

		v = new Fourwheeler();
		v.display();
		// v.show();this is not a overriden method so we cannot access this method

	}

}