package com.Containment;

public class Printer {
		private String bname;
		private String type;
		private float price;
		
		Printer(){
			
		}
		
		Printer(String bname, String type, float price){
		this.bname=bname;
		this.type=type;
		this.price=price;
		}
		
	public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname=bname;
		}
		
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type=type;
		}
		
		public float getPrice() {
			return price;
		}
		public void setPrice(float price)
		{
			this.price=price;
		} 
		
		public String toString() {
			return "\nBrand Name: "+bname+"\nPrinter Type: "+type+"\nPrice: "+price;
		}

}
