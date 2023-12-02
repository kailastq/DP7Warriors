// WAP to search the specified collection in this collection
package com.ArrayListAssign;

import java.util.ArrayList;

public class SpecifiedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1=new ArrayList<>();
		
		al1.add("Apple");
		al1.add("Banana");
		al1.add("Cherry");
		al1.add("Papaya");
		
		ArrayList<String> al2=new ArrayList<>();
		
		al1.add("Cherry");
		al1.add("Apple");
		
		boolean found=al1.containsAll(al2);
		
		if(found)
		{
			System.out.println("Element is found..");
		}
		else
		{
			System.out.println("Element is not found..");
		}
		
		
		

	}

}
