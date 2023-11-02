package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> a1=new ArrayList<>();
		
		a1.add("Java");
		a1.add("Python");
		a1.add("Angular");
		a1.add("Spring");
		a1.add("Java");
		a1.add("Html");
		a1.add("Python");
		
		System.out.println(a1);
		
		HashSet<String> hs=new HashSet<>(a1);
		System.out.println(hs);
		

	}

}
