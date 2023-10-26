package com.hashmap;

import java.util.HashMap;

public class HashmapDemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Double> hm = new HashMap<>();

		hm.put("Kailash", 89.6);
		hm.put(null, 0.0);
		System.out.println(hm.put(null, 100.0)); // replaced 0 with 100
		hm.put("Anuj", 89.6);
		hm.put("Anil", 89.6);
		hm.put("Vishal", 84.6);
		hm.put("Aniket", 99.6);
		
		System.out.println(hm);
		
		System.out.println("Size: "+hm.size());
		
		//get
		System.out.println("Marks of vishal: "+hm.get("Vishal"));
		
		System.out.println(hm.containsKey("Suraj"));
		System.out.println(hm.containsKey("Anuj"));
		
		System.out.println(hm.containsKey(84.6));
		
		//putIfAbsent
		
		System.out.println(hm.putIfAbsent("Anil", 65.3));
		
		System.out.println(hm);
		
		System.out.println(hm.putIfAbsent("Suraj", 78.4));
		
	System.out.println(hm);

	}

}
