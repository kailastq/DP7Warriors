package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> as1=new ArrayList<>();
		ArrayList<Integer> as1=new ArrayList<>();
		
//		as1.add("pen");
//		as1.add("pencil");
//		as1.add("chair");
//		as1.add("board");
//		as1.add("table");
		
		as1.add(23);
		as1.add(76);
		as1.add(56);
		as1.add(99);
		as1.add(87);
		
		for(Integer i:as1)
		{
			System.out.println(i);
		}
		
		Collections.sort(as1);
		System.out.println("========================");
		
		for(Integer s:as1)
		{
			System.out.println(s);
		}
	}

}
