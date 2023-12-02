package com.superdemo;
class Vehicle{
	int speed=200;
}

class Truck extends Vehicle{
	int speed = 250;
	
	void display ()
	{
		System.out.println("Top speed: "+super.speed);
	}
}

public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck t= new Truck();
		t.display();
		

	}

}
