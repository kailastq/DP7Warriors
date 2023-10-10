package com.Containment;

public class ConnectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer printer1=new Printer("DELL", "Color Printer", 15000f);
		Printer printer2=new Printer("HP", "Black & White", 15000f);
		
		Laptop l1=new Laptop("Gaming", "Asus", 98000, printer1 );
		Laptop l2=new Laptop("Basic", "Lenovo", 58000, printer2 );
		
		System.out.println(l1);
		System.out.println("---------------------------------");
		System.out.println(l2);
	}

}
