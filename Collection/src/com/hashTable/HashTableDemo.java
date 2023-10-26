package com.hashTable;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<>();
		
//		ht.put(1, null);  // it doesnt allow null values throws nullPointerException 
		
		ht.put(1, "Anuj");
		ht.put(2, "Vishal");
		ht.put(3, "Anil");
		ht.put(4, "Shivam");
		ht.put(5, "Suraj");
		
		System.out.println(ht);
		
		System.out.println(ht.put(2, "Kailash"));
		System.out.println(ht.put(2, "Pawan"));
		
		System.out.println(ht);
	
	}

}
