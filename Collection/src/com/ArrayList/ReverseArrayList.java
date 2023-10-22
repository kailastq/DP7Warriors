package com.ArrayList;

import java.util.ArrayList;

public class ReverseArrayList {
	static void reverseList(ArrayList<String> list)
	{
		for(int i=0, j=list.size()-1; i<list.size()/2; i++, j--)
		{
			String temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<>();
		a1.add("mango");
		a1.add("kiwi");
		a1.add("orange");
		a1.add("banana");
		a1.add("cherry");
		a1.add("pear");
		
		System.out.println("Before: "+a1);
		
		reverseList(a1);
		
		System.out.println("After: "+a1);
		
		
		

	}

}
