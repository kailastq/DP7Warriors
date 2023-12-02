package com.HashMapAssign;

import java.util.HashMap;

public class HashMapEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm2=new HashMap<>();
		
		hm2.put("One", 1);
		hm2.put("Two", 2);
		hm2.put("Three", 3);
		hm2.put("Four", 4);
		hm2.put("Five", 5);
		

		//WAP to test a HashMap is empty or not
		System.out.println(hm2.isEmpty());
		
		
		//WAP to test if a HashMap contains a mapping for the specified key
		System.out.println(hm2.containsKey("Three"));
		
		
		//WAP to search for an element from HashMap using key
		String key="Two";
		
		if (hm2.containsKey(key)) 
		{
            int value = hm2.get(key);
            System.out.println("Value for key '" + key + "': " + value);
        } 
		else 
		{
            System.out.println("Key '" + key + "' not found in the HashMap");
        }
		
		//WAP to test if a HashMap contains a mapping for the specified value
		System.out.println(hm2.containsKey(3));
		


	}

}
