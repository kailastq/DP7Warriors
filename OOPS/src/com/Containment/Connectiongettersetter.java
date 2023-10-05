package com.Containment;

public class Connectiongettersetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer printer=new Printer();
		printer.setBname("HP");
		printer.setType("Color Printer");
		printer.setPrice(5000f);
		
		Laptop l1=new Laptop();
		
		l1.setConfiguration("Gaming");
		l1.setName("Asus");
		l1.setPrice(5000);
		l1.setPrinter(printer);
		
		System.out.println(l1);
		
		Laptop l2=new Laptop();
		l2.setConfiguration("Basic");
		l2.setName("Lenovo");
		l2.setPrice(450000);
		l2.setPrinter(new Printer());
		l2.getPrinter().setBname("Hp");
		l2.getPrinter().setType("Black & White");
		l2.getPrinter().setPrice(450000);
		
		System.out.println(l2);
		
		

	}

}
