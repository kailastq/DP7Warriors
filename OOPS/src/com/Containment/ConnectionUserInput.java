package com.Containment;
import java.util.Scanner;

public class ConnectionUserInput {
	
		static Scanner sc=new Scanner(System.in);
		
		void EnterlaptopDetails(Laptop l) {
			
			System.out.println("Enter Laptop Configuration: ");
			l.setConfiguration(sc.next());
			
			System.out.println("Enter Laptop Name: ");
			l.setName(sc.next());
			
			System.out.println("Enter the Price: ");
			l.setPrice(sc.nextInt());
			
			l.setPrinter(new Printer());
			
			System.out.println("Enter the Brand Name: ");
			l.getPrinter().setBname(sc.next());
			
			System.out.println("Enter the Type of Printer: ");
			l.getPrinter().setType(sc.next());
			
			System.out.println("Enter the Price: ");
			l.getPrinter().setPrice(sc.nextFloat());
		}
		public static void main(String[] args) {
			ConnectionUserInput connection=new ConnectionUserInput();
			Laptop l1=new Laptop();
			Laptop l2=new Laptop();
			
			connection.EnterlaptopDetails(l1);
			connection.EnterlaptopDetails(l2);
			
			System.out.println(l1);
			System.out.println(l2);
			
		}
		

}
