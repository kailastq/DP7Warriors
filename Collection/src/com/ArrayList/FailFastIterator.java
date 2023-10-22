package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1=new ArrayList<>();
		a1.add("mango");
		a1.add("kiwi");
		a1.add("orange");
		a1.add("banana");
		a1.add("cherry");
		a1.add("pear");
		
		// remove angular
		
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals("Angular"))
				// a1.remove("Angular") // ConcurrentModificationException
				
				itr.remove();
		}
		System.out.println(a1);

	}

}
