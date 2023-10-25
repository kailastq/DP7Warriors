package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> a1=new LinkedList<>();
		
		a1.add("Banana");
		a1.add("kiwi");
		a1.add("Mango");
		a1.add("Orange");
		a1.add("cherry");
		
		ListIterator<String> litr=a1.listIterator(a1.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		System.out.println("----------------------------------------------");
		
		Iterator<String>itr =a1.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----------------------------------------------");
		
		for(int i=0; i<a1.size(); i++)
		{
			System.out.println(a1);
		}
		
		System.out.println("----------------------------------------------");
		
		for(String s:a1)
		{
			System.out.println(s);
		}
		
		System.out.println("----------------------------------------------");
		
		Iterator<String> itr1=a1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("----------------------------------------------");
		
		ListIterator<String> litr1= a1.listIterator(a1.size());
		while(litr1.hasNext())
		{
			System.out.println(litr1.next());
		}
		
		System.out.println("----------------------------------------------");
		
		ListIterator<String> litr2=a1.listIterator();
		while(litr2.hasPrevious())
		{
			System.out.println(litr2.previous());
		}
		
		System.out.println("----------------------------------------------");
				
		
		
		
		
		

	}

}
