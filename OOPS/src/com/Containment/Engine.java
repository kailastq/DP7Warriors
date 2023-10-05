package com.Containment;

public class Engine {
	
	private String type;
	private int model;
	private int price;
	
	
	public Engine() {
		
	}
	
	public Engine(String type, int model, int price) {
		this.type=type;
		this.model=model;
		this.price=price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public String toString() {
		return "\nType: " + type + "\nModel: " + model +"\nPrice: "+price;
	}
	
	

}
