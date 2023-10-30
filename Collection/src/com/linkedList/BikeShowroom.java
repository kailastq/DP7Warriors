package com.linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class BikeShowroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Bike> bl1=new LinkedList<Bike>();
		
		bl1.add(new Bike(100, "CBZ", 115000, 2009));
		bl1.addFirst(new Bike(101, "CBR", 235000, 2016));
		bl1.add(new Bike(102, "Bullet", 150000, 2022));
		bl1.addLast(new Bike(103, "Triumph", 300000, 2023));
		bl1.addLast(new Bike(104, "Jawa", 210000, 2019));
		bl1.add(2, new Bike(102, "Ola", 150000, 2022));
		
		Collections.sort(bl1);
		for(Bike b:bl1)
		{
			System.out.println(b);
		}
		
		System.out.println("------------------------------------");
		
		Iterator<Bike>itr=bl1.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getModelyear()<2010)
			{
				itr.remove();
			}
		}
		
		for(Bike b:bl1)
		{
			System.out.println(b);
		}
		
		
		

	}

}
