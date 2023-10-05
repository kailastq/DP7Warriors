package com.Inheritance;

class Vehicle2 {
	private int id;
	private int model;
	protected float price;

	public Vehicle2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle2(int id, int model, float price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

class Car2 extends Vehicle2 {
	private String name;
	private int noOfgears;
	private String fuelType;

	Car2() {

	}

	Car2(int id, int model, float price, String name, int noOfgears, String fuelType) {
		super(id, model, price);
		this.name = name;
		this.noOfgears = noOfgears;
		this.fuelType = fuelType;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfgears() {
		return noOfgears;
	}

	public void setNoOfgears(int noOfgears) {
		this.noOfgears = noOfgears;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String toString() {
		return "\nid:" + getId() + "\ncar name:" + name + ", noOfgears=" + noOfgears + ", fuelType=" + fuelType
				+ " , price:" + price;
	}

}

class RacingCar extends Car2 {
	private float maxSpeed;
	private float mileage;

	public RacingCar() {

	}

	public RacingCar(int id, int model, float price, String name, int noOfgears, String fuelType, float maxSpeed,
			float mileage) {
		super(id, model, price, name, noOfgears, fuelType);
		this.maxSpeed = maxSpeed;
		this.mileage = mileage;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}

	public String toString() {
		return super.toString() + " ,MaxSpeed:" + maxSpeed + " ,Mileage:" + mileage;

	}

}

public class Multilevel {

	public static void main(String[] args) {

		Car2 bmw = new Car2(101, 2022, 4500000f, "BMWX1", 6, "Petrol");
		System.out.println(bmw);

		bmw.price = 5500000f; // protected member of Vehicle

		System.out.println(bmw);

		RacingCar rc1 = new RacingCar(102, 2023, 6700000, "Formula1", 6, "Diesel", 400f, 30f);
		System.out.println(rc1);

		rc1.price = 7700000f;

	}

}
