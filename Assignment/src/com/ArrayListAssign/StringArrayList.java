package com.ArrayListAssign;

import java.util.ArrayList;
import java.util.Collections;

public class StringArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> as1=new ArrayList<>();
		
		as1.add("Aniket");
		as1.add("Kailash");
		as1.add("Anuj");
		as1.add("Vishal");
		as1.add("Pawan");
		
		for(String s:as1)
		{
			System.out.println(s);
		}
		
		Collections.sort(as1);
		System.out.println("=====================");
		
		for(String s:as1)
		{
			System.out.println(s);
		}
		
		

	}

}
