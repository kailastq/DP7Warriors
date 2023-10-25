package com.linkedList;

import java.util.LinkedList;
import java.util.Collections;

public class BookLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Book> blist=new LinkedList<>();
		
		blist.add(new Book(100, "Wings", 550f));
		blist.add(new Book(100, "Harry Potter", 550f));
		blist.add(new Book(100, "Beloved", 550f));
		blist.add(new Book(100, "Catch", 550f));
		
		System.out.println(blist);
		
		System.out.println("-------------------------------------------");
		
		for(Book b:blist)
		{
			System.out.println(b);
		}
		System.out.println("-------------------------------------------");
		
		Collections.sort(blist);
		
		for(Book b:blist)
		{
			System.out.println(b);
		}
		System.out.println("-------------------------------------------");

		Collections.sort(blist, new PriceComparator());
		
		for(Book b:blist)
		{
			System.out.println(b);
		}
		System.out.println("-------------------------------------------");

		Collections.sort(blist, new IdComparator());
		
		for(Book b:blist)
		{
			System.out.println(b);
		}
		

	}

}
