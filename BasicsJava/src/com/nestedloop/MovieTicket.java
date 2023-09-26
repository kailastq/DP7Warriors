package com.nestedloop;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Movie Name: ");
		String name = sc.next();
		System.out.println("Enter the Rating: ");
		float rating = sc.nextFloat();
		System.out.println(" Enter the ticket Price: ");
		int price = sc.nextInt();

		System.out.println("Enter the Coupon Code if available..");
		System.out.println("Press 0  for silver & Press 1 for Gold");
		
		System.out.println("Enter the code:");
		int code = sc.nextInt();

		if ( code == 0  ||  code==1)
		if (code == 0)
		{
			double discount = (price - 50);
			System.out.println(" Congratulation, You are getting your ticket at price of "+ discount);
		} 
		else if (code == 1)
		{
			double discount = (price - 100);
			System.out.println(" Congratulation, You are getting your ticket at price of  "+ discount);
		}
		else
		{
			System.out.println("Your new ticket price is :" + price);
		}
		System.out.println(" Enjoy the Movie..!");

	}

}
