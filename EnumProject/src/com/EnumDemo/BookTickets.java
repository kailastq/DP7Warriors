package com.EnumDemo;

import java.util.Scanner;

public class BookTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the ticket type");
		System.out.println("1. STANDARD");
		System.out.println("2. PREMIUM");
		System.out.println("3. RECLINER");
		
		int seatType=sc.nextInt();
		
		System.out.println("Enter number of seats: ");
	
		int num=sc.nextInt();
		
		MovieSeats ms=null;
		
		switch(seatType)
		{
		case 1: ms= MovieSeats.STANDARD;
		break;
		
		case 2: ms= MovieSeats.PREMIUM;
		break;
		
		case 3: ms= MovieSeats.RECLINER;
		break;
		
		default: System.out.println("Error");
		}
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Ticket Type: "+ms);
		System.out.println("Number of Tickets: "+num);
		System.out.println("Total amount: "+(num*(ms.price)));
		
	}

}
