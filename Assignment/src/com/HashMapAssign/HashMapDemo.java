//WAP to add elements to a HashMap without using generics (ie do not use <>) and print content
//of it. Use Integer as Key and String as Value. In second HashMap add elements of String type as
//Key and Integer as Value.


package com.HashMapAssign;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap<>();
		
		hm.put(1, "banana");
		hm.put(2, "kiwi");
		hm.put(3, "cherry");
		hm.put(4, "apple");
		hm.put(5, "mango");
		
	//	System.out.println(hm);
		
		Set<Entry<Integer,String>> e12=hm.entrySet();
		
		for(Entry<Integer, String> e1: e12)
		{
			System.out.println(e1.getValue()+"---->"+e1.getKey());
		}
		
		System.out.println("===============================");
		
		HashMap<String, Integer> hm2=new HashMap<>();
		
		hm2.put("One", 1);
		hm2.put("Two", 2);
		hm2.put("Three", 3);
		hm2.put("Four", 4);
		hm2.put("Five", 5);
		
	// System.out.println(hm2);
		Set<Entry<String, Integer>> e13=hm2.entrySet();
		for(Entry<String, Integer> e: e13)
		{
			System.out.println(e.getKey()+"---->"+e.getValue());
		}
		
		System.out.println("================================");
		
		
		
		
		
		

	}

}
