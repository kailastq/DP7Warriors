//WAP to iterate through all elements in an ArrayList using for loop
// WAP to iterate through all elements in an ArrayList using for each


package com.ArrayListAssign;

import java.util.ArrayList;

public class IteratorForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("kiwi");
		al.add("Orange");
		
		System.out.println(al);
		
		System.out.println("----------------------------------------------");
		
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("----------------------------------------------");
		
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
