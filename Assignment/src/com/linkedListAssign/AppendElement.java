//1. WAP to append the specified element to the end of a linked list.

package com.linkedListAssign;

import java.util.LinkedList;

public class AppendElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls1=new LinkedList<>();
		
		ls1.add("One");
		ls1.add("Two");
		ls1.add("Three");
		
		System.out.println(ls1);
		
		
//		for(String s:ls1)
//		{
//			System.out.println(s);
//		}
		
		ls1.addLast("Four");
		ls1.addLast("Five");
		
		System.out.println(ls1);
		
		
		
		
		
		

	}

}
