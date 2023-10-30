package com.linkedList;

public class Bike implements Comparable<Bike>{
	private int id;
	private String name;
	private double price;
	private int modelyear;
	
	Bike(){
		
	}

	public Bike(int id, String name, double price, int modelyear) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.modelyear = modelyear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getModelyear() {
		return modelyear;
	}

	public void setModelyear(int modelyear) {
		this.modelyear = modelyear;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", price=" + price + ", modelyear=" + modelyear + "]";
	}

	@Override
	public int compareTo(Bike b) {
		// TODO Auto-generated method stub
		if(this.getPrice()==b.price)
			return this.getName().compareTo(b.getName());
		else
			if(this.getPrice()>b.getPrice())
				return 1;
			else
				return  -1;
	}
	
	

}
