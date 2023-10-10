package com.Overriding;

class Machine{
	void display() {
		System.out.println("This is Machine...");
	}
}

class Car extends Machine{
	void display() {
		System.out.println("This is Car");
	}
}

class Truck extends Machine{
	void show() {
		System.out.println("This is Truck");
	}
}

public class MethodOverRiding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m=new Machine();
		m.display();
		
		Car c=new Car();
		c.display();
		
		Truck t=new Truck();
		t.show();

	}

}
