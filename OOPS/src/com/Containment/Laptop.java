package com.Containment;

public class Laptop {
		private String configuration;
		private String name;
		private int price;
		private Printer printer;
		
		Laptop(){
			
		}
		
		Laptop(String configuration, String name, int price, Printer printer){
			this.configuration=configuration;
			this.name=name;
			this.price=price;
			this.printer=printer;
		}
		
		public String getConfiguration() {
			return configuration;
		}
		public void setConfiguration(String configuration) {
			this.configuration=configuration;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price=price;
		}
		
		public Printer getPrinter() {
			return printer;
		}
		public void setPrinter(Printer printer) {
			this.printer=printer;
		} 

		public String toString() {
			return "\nLaptop Configuration: " + configuration + "\nName: " + name + "\nprice: " + price + "\nPrinter: "
					+ printer ;
		}
		
		
	

}
