//WAP to get the portion of a HashMap whose keys are strictly less than a given key
package com.HashMapAssign;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemoQ14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmp=new HashMap<>();
		
		hmp.put(1, "One");
		hmp.put(2, "Two");
		hmp.put(3, "Three");
		hmp.put(4, "Four");
		hmp.put(5, "Five");
		
		int k=5;
		for(Map.Entry<Integer, String> entries: hmp.entrySet())
		{
			if(entries.getKey()< k)
			{
				System.out.println(entries.getKey()+"===="+entries.getValue());
			}

	}
	}

}
