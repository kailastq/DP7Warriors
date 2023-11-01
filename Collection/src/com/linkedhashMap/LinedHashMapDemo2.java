package com.linkedhashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinedHashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// access order
		
		LinkedHashMap<String, Double> lhm=new LinkedHashMap<>(16, 0.75f, true);
		
		lhm.put("Suraj", 69.2);
		lhm.put("Harsh", 89.2);
		lhm.put("Anuj", 78.2);
		lhm.put("Pawan", 58.7);
		lhm.put("Sai", 69.2);
		lhm.put("Kailash", 92.5);
		
		for(Map.Entry<String, Double> e: lhm.entrySet())
		{
			System.out.println(e.getKey()+": "+e.getValue());
		}
		
		System.out.println("Marks of Anuj: "+lhm.get("Anuj"));
		System.out.println("Marks of Kailash: "+lhm.get("Kailash"));
		
		System.out.println("------------------------------------------------------------");
		
		for(Map.Entry<String, Double> e: lhm.entrySet())
		{
			System.out.println(e.getKey()+": "+e.getValue());
		}
		
		

	}

}
