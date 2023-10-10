package com.encapsulation;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Customer Id:");
		int id = sc.nextInt();
		System.out.println("Enter the Name:");
		String name = sc.next();
		System.out.println(" Enter the Account Number:");
		int acc = sc.nextInt();

		CustomerBank c = new CustomerBank();
		c.setC_id(id);
		c.setCname(name);
		c.setAccountno(acc);

		System.out.println(c.getCid() + " " + c.getCname() + " " + c.getAccountno());

		System.out.println("-------------------------------------------------------------");

		System.out.println(" Choose to credit or Debit..");
		System.out.println("Enter C for credit and Enter D for debit ");
		char option = sc.next().charAt(0);
		System.out.println("Enter the Amount");
		int Amount = sc.nextInt();

		if (option == 'C') {
			System.out.println("Enter the amount to credit: ");
			int credit=sc.nextInt();
			int balance=+credit;
			
			System.out.println("Your Balance is: "+(Amount+credit));
			
		}
		else if(option =='D')
		{
			System.out.println("Enter the amount to debited: ");
			int debit=sc.nextInt();
			int balance=+debit;
			
			System.out.println("Your Balance is: "+(Amount-balance));
			System.out.println("Thank you Visit Again..!");
		}
		
		else {
			System.out.println("Plz choose Correct Option");
		}
		
		
	}

}
