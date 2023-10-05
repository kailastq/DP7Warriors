package com.objectpassing;
import java.util.Scanner;

import com.encapsulation.Book;

public class Mylibrary {
	
	static Scanner sc=new Scanner(System.in);
	
	static void insertBook(Book b) {
		
		System.out.println("Enter book id:");
		b.setBookId(sc.nextInt());
		
		System.out.println("Enter book name:");
		b.setBname(sc.next());
		
		System.out.println("Enter book price:");
		b.setPrice(sc.nextFloat());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1= new Book();
		insertBook(b1);
		
		
		Book b2= new Book();
		insertBook(b2);
		
		b2.setPrice(3000);
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(b1);
		System.out.println(b2);
		//System.out.println(b3);
		
		
		Book b3= new Book();
		b3=b1;  // shallow copy : change in one object is reflecting in another
		
		System.out.println("-------------------------------------------------------");
		System.out.println(b1);
		b3.setPrice(5000);
		
		System.out.println("-------------------------------------------------------");
		System.out.println(b1);
		System.out.println(b2);
		
  
	}

}
