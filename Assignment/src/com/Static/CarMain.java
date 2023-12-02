package com.Static;

class Car {
	private String model;
	private static int totalCarSold;

	Car() {

	}

	Car(String model, int totalCarSold) {
		this.model = model;
		this.totalCarSold=totalCarSold; //it should be accessed in static way only 
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public static int getTotalCarSold() {
		return totalCarSold;
	}

	public static void setTotalCarSold(int totalCarSold) {
		Car.totalCarSold = totalCarSold; // cannot use "this" in static
	}

}

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("Sport", 500);
		Car c2=new Car("Coupe", 300);
		
		System.out.println(c1.getModel());
		System.out.println(c1.getTotalCarSold());
		
		System.out.println(c2.getModel());
		System.out.println(c2.getTotalCarSold());
		
		

	}

}
