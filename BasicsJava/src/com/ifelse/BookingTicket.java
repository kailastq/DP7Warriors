package com.ifelse;

import java.util.Scanner;

public class BookingTicket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String Name = sc.next();
		System.out.println("Enter the Airline: ");
		String Airline = sc.next();
		System.out.println("Enter the Departure: ");
		String Departure = sc.next();
		System.out.println("Enter the Destination: ");
		String Destination = sc.next();
		System.out.println("Enter the Coupen code: ");
		int Coupencode = sc.nextInt();

		double ticket = 35000;

		if ( Coupencode  == 101020)
		{
			System.out.println(" Congratulation you get 10% off.! ");
			double discount = ticket * 0.10;
			System.out.println("You saved " + discount + " on your ticket");
		}
     	else 
		{
			System.out.println("Sorry. ! You are not eligible for the discount ");
		}
		System.out.println("Have a safe Journey..!");

	}

}