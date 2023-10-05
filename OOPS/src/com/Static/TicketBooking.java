package com.Static;

import java.util.Scanner;

class Ticket {
	private int ticketid;
	int price = 100;
	int nooftickets;
	static int availabletickets;
	int totalAmount;

	static {
		availabletickets = 30;
	}

	Ticket() {

	}

	Ticket(int ticketid, int availabletickets, int nooftickets) {
		this.ticketid = ticketid;
		this.availabletickets = availabletickets;
		this.nooftickets = nooftickets;
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailabletickets() {
		return availabletickets;
	}

	public static void setAvailabletickets(int availabletickets) {
		Ticket.availabletickets = availabletickets;
	}

	public String toString() {
		return "\nTicket id:" + ticketid + "\nPrice:" + price + "\nAvailable Ticket: " + availabletickets;
	}

	public int calculateTickets() {
		if (availabletickets > nooftickets) {
			availabletickets = availabletickets - nooftickets;
			totalAmount = nooftickets * price;
			return totalAmount;
		} else
			return -1;
	}
}

public class TicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ticket t1 = new Ticket();
		System.out.println("Enter number of booking: ");
		int n = sc.nextInt();

		System.out.println("AVAILABLE TICKETS ARE :" + t1.availabletickets);
		for (int i = 1; i <= n; i++)
		// while (t1.getAvailTicket () !=0)

		{
			System.out.println("Enter ticket id: ");
			t1.availabletickets = sc.nextInt();
			System.out.println("price of each ticket is: " + t1.price);
			System.out.println("Enter number of tickets you want: ");
			t1.nooftickets = sc.nextInt();
			t1.calculateTickets();
			System.out.println("total ammount is: " + t1.totalAmount);
			System.out.println("AVAILABLE TICKETS AFTER BOOKING :" + t1.getAvailabletickets());

		}
	}
}
