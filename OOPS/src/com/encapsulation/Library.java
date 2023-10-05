package com.encapsulation;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		Scanner sc=new Scanner(System.in);
		
		b1.setBookId(101);
		b1.setBname("Harry potter");
		b1.setPrice(657);
		
		//System.err.println(b1.getBookId()+" "+b1.getBname()+" "+b1.getPrice());
		//System.out.println(b1);
		
		Book b2=new Book();
		
		System.out.println("Enter book id:");
		// int id =sc.nextInt();
	// 	b2.setBookId(id);
		
		b2.setBookId(sc.nextInt());
		
		System.out.println("Enter book name:");
		b2.setBname(sc.next());
		
		System.out.println("Enter book price");
		b2.setPrice(sc.nextFloat());
		
		System.out.println(b2);
		

	}

}
