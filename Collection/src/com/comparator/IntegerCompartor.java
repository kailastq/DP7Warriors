package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyIntegerComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return (i2-i1);
	}
	
}
public class IntegerCompartor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(7);
		al.add(1);
		al.add(-3);
		al.add(10);
		
//		System.out.println(al);
//		Collections.sort(al);  //Ascending order
//		
//		System.out.println(al);
//		
		System.out.println(al);
		Collections.sort(al, new MyIntegerComparator());  //use custom sorting logic on inbuilt classes 
		
		System.out.println(al);
		

	}

}
