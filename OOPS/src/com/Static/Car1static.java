package com.Static;

public class Car1static {
	String name1;
	String name2;

	static int cars = 0;  // static variable

	int noofcars()   // we can write static variable inside instance method
	{
		cars++;
		return cars;
	}

	public static void main(String[] args) {
		Car1static c1 = new Car1static();
		Car1static c2 = new Car1static();
		c1.noofcars();
		System.out.println(c2.noofcars());

	}

}
