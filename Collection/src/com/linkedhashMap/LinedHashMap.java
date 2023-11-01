package com.linkedhashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Double> lhm=new LinkedHashMap<>();
		
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
				System.out.println("--------------------------------");
				System.out.println(lhm.get("Anuj"));
				
		

	}

}
