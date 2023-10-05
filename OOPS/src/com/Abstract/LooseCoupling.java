package com.Abstract;

abstract class Truck {
	String brandname;
	int price;

	Truck() {

	}

	Truck(String brandname, int price) {
		this.brandname = brandname;
		this.price = price;
	}

	public String toString() {
		return "Brand Name: " + brandname + "\nPrice: " + price;
	}
}

class Tata extends Truck {
	Tata() {
		super("Tata", 5500000);
	}
}

class Scania extends Truck {
	Scania() {
		super("Scania", 7000000);
	}
}

public class LooseCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck t = new Tata();
		System.out.println(t);

		Truck t1 = new Scania();
		System.out.println(t1);

	}

}
