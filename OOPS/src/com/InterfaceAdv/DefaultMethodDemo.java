package com.InterfaceAdv;

interface Calculation {
	float pi = 3.14f;

	void area();

	// Java 8: default and static
	// to make interface mutable and provide backward compatibiity
	default void volume() {
		System.out.println("In Volume method");
		show();
	}

	// to provide common implementation
	// belongs to interface
	static void info() {
		System.out.println("Geometry shapes");
		display();
	}

	// confidential which cannot be accessed directly
	// any sensitive code of agreement
	// Java 9 : private
	// If this private is instance : accessed in default method
	// private method: static: accessed in static method

	private void show() {
		System.out.println("Made by: Sharayu");
	}

	private static void display() {
		System.out.println("Pan No: EVQPD6515J");

	}
}

class Square implements Calculation {
	int side;

	public Square() {
		super();
	}

	Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stu
		System.out.println("Area of square is: " + (side * side));
	}
}

class Cube implements Calculation {
	int side;

	Cube() {

	}

	Cube(int side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of cube is: " + (6 * (side * side)));

	}

	public void volume() {
		System.out.println("Volume of cube is: " + (side * side * side));

	}

}

public class DefaultMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c;
		
		c= new Square(6);
		c.area();
		c.volume();
		
		c=new Cube(10);
		c.area();
		c.volume();
		
		Calculation.info();

	}

}
