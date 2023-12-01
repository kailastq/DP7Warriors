package com.Inheritance;

class Vehicle {
	private int num;
	private String type;
	private float price;

	public Vehicle() 
	{
		super();
	}

	public Vehicle(int num, String type, float price) {
		this.num = num;
		this.type = type;
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {
		return "\nVehicle Num: " + num + "\nType: " + type + "\nPrice: " + price ;
	}
}


class Cardemo extends Vehicle{
		private int vehicleage;
		private String model;
		
		
		Cardemo(){
			
		}
		
		Cardemo (int num, String type, float price, int vehicleage, String model ){
			super(num,type,price);
			this.vehicleage=vehicleage;
			this.model=model;
		}

		public int getVehicleage() {
			return vehicleage;
		}

		public void setVehicleage(int vehicleage) {
			this.vehicleage = vehicleage;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String toString() {
			
			System.out.println(super.toString());
			return "Vehicle Age: " + vehicleage + "\nModel: " + model;
		}	
	}
	
	
public class Carmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Vehicle v=new Vehicle(7007, "Sedan", 5500000);
	//  System.out.println(v);
		
		Cardemo c1=new Cardemo (7007, "Sports", 5500000f,  1,  "Supra");
		System.out.println(c1);


	}

}
