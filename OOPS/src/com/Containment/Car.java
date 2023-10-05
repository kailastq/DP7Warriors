package com.Containment;

public class Car{
		 private String cname;
		 private String bname;
		 private float price;
		 
		 Car()
		 {
			 
		 }
		 
		 Car(String cname, String bname, Float price){
			 this.cname=cname;
			 this.bname=bname;
			 this.price=price;
		 }
		 
		 public String getCname() {
			 return cname;
		 }
		 public void setCname(String cname) {
			 this.cname=cname;
		 }
		 
		 public String getBname() {
			 return bname;
		 }
		 public void setBname(String bname) {
			 this.bname=bname;
		 }
		 
		 public float getPrice() {
			 return price;
		 }
		 public void setPrice(float price) {
			 this.price=price;
		 }
		 
		 public String toString() {
			 return "\nCar Name: "+cname+"\nBrand Name: "+bname+"\nPrice:"+price;
		 }
		 
		 
}
