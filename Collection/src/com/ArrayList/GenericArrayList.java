package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List <Integer>list1=new ArrayList<>();
		List <Integer>list1=new ArrayList<Integer>();

		
		list1.add(12);
		list1.add(89);
		list1.add(67);
		list1.add(90);
		
		
		System.out.println(list1);
		
		for(int i=0; i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			int data=(int) list1.get(i)+10; 
			list1.set(i, data);
			
		}
		
		System.out.println(list1);
		

	}

}
