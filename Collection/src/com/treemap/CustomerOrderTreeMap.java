package com.treemap;

import java.util.Map;
import java.util.TreeMap;

public class CustomerOrderTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Customer, Order> tmap=new TreeMap<>(new MobileNoComparator());
		
		tmap.put(new Customer(1, "Anuj", 98745632), new Order(101, "Laptop", 45000));
		tmap.put(new Customer(1, "Anuj", 98745632), new Order(102, "HardDisk", 10000));
		tmap.put(new Customer(2, "Nishant", 98745654), new Order(103, "PenDrive", 450));
		tmap.put(new Customer(3, "Pratik", 98785632), new Order(104, "Mobile", 40000));
		tmap.put(new Customer(4, "Vishal", 98725632), new Order(105, "Charger", 1600));
		tmap.put(new Customer(5, "Deepak", 98005632), new Order(106, "Earphones", 5000));
		
		for(Map.Entry<Customer, Order> e : tmap.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("---------------------------------------------");
			
		}
	}

}
