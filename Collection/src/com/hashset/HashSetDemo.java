package com.hashset;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		

		hs.add("Java");
		hs.add("C++");
		//System.out.println(hs.add("Go"));  // return true coz its null before insert
		hs.add("SQL");
		hs.add("Python");
		hs.add("Angular");
		hs.add("Go");
		//System.out.println(hs.add("Go")); // return false coz it already present
		hs.add(null);

		System.out.println(hs);
		
		HashSet<String> hs2 = new HashSet<>();
		
		hs2.add("Numpy");
		hs2.add("React JS");
		hs2.add("Java");
		hs2.add("C++");
		hs2.add(".net");
		
		System.out.println(hs2);
		
		// Mathematical Operation
		
		// union
		
		hs.addAll(hs2);
		System.out.println(hs);
		
//		// difference
//		hs.removeAll(hs2);
//		System.out.println(hs);
		
		
		// intersection
		hs.retainAll(hs2);
		System.out.println(hs);
		

	}

}
