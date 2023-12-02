package com.ArrayListAssign;

import java.util.ArrayList;
import java.util.Iterator;

public class AlternateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>a1=new ArrayList<>();
		
		a1.add(55);
		a1.add(65);
		a1.add(75);
		a1.add(85);
		a1.add(25);
		a1.add(35);
		a1.add(45);
		
		for(int i=0; i<a1.size(); i=i+2)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("--------------------------------");
		
		System.out.println("By Using Iterator- ");
		
		Iterator<Integer>itr=a1.iterator();
		while(itr.hasNext())
		{
			int num=itr.next();
			if(itr.hasNext())
				itr.next();
			System.out.println(num);
		}
		

	}

}
