package com.Static;

public class CarStatic {

	String model = "Volvo";
	static int totalCarSold = 90;

	public static void main(String[] args) {

		CarStatic c = new CarStatic();
		String model = "Car";
		int totalCarSold = 50;
		System.out.println(model);
		System.out.println(c.model);
		System.out.println(totalCarSold);
		System.out.println(CarStatic.totalCarSold);

	}

}