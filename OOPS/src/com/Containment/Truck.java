package com.Containment;

public class Truck {
	private  int model;
	private String truckname;
	private Machine m;
	
	
	Truck(){
		
	}
	
	Truck(int model, String truckname, Machine m){
		this.model=model;
		this.truckname=truckname;
		this.m=m;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getTruckname() {
		return truckname;
	}

	public void setTruckname(String truckname) {
		this.truckname = truckname;
	}

	public Machine getM() {
		return m;
	}

	public void setM(Machine m) {
		this.m = m;
	}

	public String toString() {
		return "\nTruck Model: " + model + "\nTruck Name: " + truckname + "Machine: " + m;
	}
	
	
	

}
