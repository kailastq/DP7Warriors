package com.ArrayListAssign;

import java.util.ArrayList;

public class GeneralArrayList {
	static void reverseArrayList(ArrayList<String> a1,ArrayList<String> reverse)
	{
		for(int i=a1.size()-1; i>=0; i--)
		{
			reverse.add(a1.get(i));
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		
		a1.add("Kailash");
		a1.add("Vishal");
		a1.add("Pawan");
//		a1.add(null);  // it allows null values


		System.out.println(a1);
		ArrayList<String> reverse=new ArrayList<>();
		reverseArrayList(a1,reverse);
		System.out.println(reverse);
		
//		a1.clear();
//		System.out.println(a1); // it gives us empty list
		
//		a1.removeAll(a1);
//		System.out.println(a1); // it also gives us empty list
		
	
		
		
		
		
	}

}
