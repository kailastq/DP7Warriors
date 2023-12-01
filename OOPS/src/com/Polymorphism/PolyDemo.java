package com.Polymorphism;

class Shape {
	void area(int side) {
		System.out.println("Area of Square: " + (side * side));
	}

	void area(int length, int breadth) {
		int result=(length * breadth);
		System.out.println("Area of rectangle: " + result);
	}

	void area(float radius) {
		float pi = 3.14f;
		System.out.println("Area of Circle: " + (pi * radius * radius));
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape square = new Shape();
		square.area(7);

		Shape rectangle = new Shape();
		rectangle.area(6, 7);

		Shape circle = new Shape();
		circle.area(2.3f);

	}

}
