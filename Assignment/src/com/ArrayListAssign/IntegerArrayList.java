package com.ArrayListAssign;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a1=new ArrayList<>();
		
		a1.add(5);
		a1.add(11);
		a1.add(1);
		a1.add(89);
		a1.add(6);
		
		for(Integer i:a1)
		{
			System.out.println(i);
		}
		
		Collections.sort(a1);
		System.out.println("======================");
		
		for(Integer i:a1)
		{
			System.out.println(i);
		}
		
		

	}

}
