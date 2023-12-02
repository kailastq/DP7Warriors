//WAP to insert the specified element at the specified position in the linked list.
//WAP to insert elements into the linked list at the first and last position.
//WAP to insert the specified element at the front of a linked list.
//WAP to insert the specified element at the end of a linked list.
//WAP to insert some elements at the specified position into a linked list
//WAP to remove a specified element from a linked list.
//WAP to remove first and last element from a linked list.
//WAP to remove all the elements from a linked list

package com.linkedListAssign;

import java.util.LinkedList;

public class LinkdListDemoCW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l1=new LinkedList<>();
		
		l1.add("Monday");
		l1.add("Wednesday");
		l1.add("Thursday");
		l1.add("Saturday");
		
		System.out.println(l1);
		
		//WAP to insert the specified element at the specified position in the linked list.
		l1.add(1, "Tuesday");
		l1.add(4,"Friday");
		
		System.out.println(l1);
		
		//WAP to insert the specified element at the front of a linked list
		//WAP to insert the specified element at the end of a linked list.
		//WAP to insert elements into the linked list at the first and last position.
		l1.addFirst("Happy");
		l1.addLast("Weekend");
		
		System.out.println(l1);
		System.out.println("=========================");
		
		for(String s:l1)
		{
			System.out.println(s);
		}
		
		System.out.println("=========================");
		
		
		//WAP to remove a specified element from a linked list.
		l1.remove(2);
		//l1.remove("Tuesday");
		System.out.println(l1);
		System.out.println("=========================");
		
		//WAP to remove first and last element from a linked list.
		l1.removeFirst();
		System.out.println(l1);
		System.out.println("=========================");
		
		l1.removeLast();
		System.out.println(l1);
		System.out.println("=========================");
		
		//WAP to remove all the elements from a linked list.
		l1.removeAll(l1);
		System.out.println(l1);
		
		
		

	}

}
