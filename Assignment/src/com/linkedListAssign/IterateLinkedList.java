//WAP to iterate through all elements in a linked list.
//WAP to iterate a linked list in reverse order.

package com.linkedListAssign;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> lstr=new LinkedList<>();
		
		lstr.add("One");
		lstr.add("Two");
		lstr.add("Three");
		lstr.add("Four");
		
		//Reverse order
		
//		ListIterator<String> litr=lstr.listIterator(lstr.size());
//		while(litr.hasPrevious())
//		{
//			System.out.println(litr.previous());
//		}
//		
		System.out.println("-----------------------------------------");
		
		Iterator<String> itr=lstr.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------------------------");

		for(int i=0; i<lstr.size(); i++)
		{
			System.out.println(lstr);
		}
		
		System.out.println("-----------------------------------------");

		for(String s:lstr)
		{
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------------");

		Iterator<String> itr1=lstr.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("-----------------------------------------");

		ListIterator<String> litr1=lstr.listIterator();
		while(litr1.hasNext())
		{
			System.out.println(litr1.next());
		}
		
		System.out.println("-----------------------------------------");

		ListIterator<String> litr2=lstr.listIterator();
		while(litr2.hasPrevious())
		{
			System.out.println(litr2.previous());
		}
		
	}

}
