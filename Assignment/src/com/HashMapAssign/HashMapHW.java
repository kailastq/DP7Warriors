package com.HashMapAssign;

import java.util.HashMap;
import java.util.Map;
//2.	WAP to test a HashMap is empty or not
public class HashMapHW {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<>();
		
		System.out.println(hm.isEmpty());  //before inserting 
		
		hm.put(11, "One");
		hm.put(12, "Two");
		hm.put(13, "Three");
		hm.put(14, "Four");
		hm.put(15, "Five");
		
		System.out.println(hm);
		System.out.println(hm.isEmpty());  //after inserting
		System.out.println("========================");
		
		//3.WAP to test if a HashMap contains a mapping for the specified key
		System.out.println("Three :"+hm.containsKey("Three")); 
		System.out.println("========================");
		
		//4. WAP to search for an element from HashMap using key
		System.out.println("Three :"+hm.containsKey(13));  // by using key
		
		System.out.println("15 :"+hm.containsValue("Five"));
		System.out.println("========================");
		
		//6.WAP to get only the Keys from a HashMap
		//7.WAP to get only the Values from a HashMap
		
		for(Map.Entry<Integer, String> e: hm.entrySet())
		{
			System.out.println(e.getKey()+">>>"+e.getValue());
		}
		System.out.println("========================");
		
		
		
			
		
	}
}