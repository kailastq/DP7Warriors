package com.hashset;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Item> hs=new HashSet<>();
		
		hs.add(new Item(1, "Sugar", 34));
		hs.add(new Item(2, "Flour", 34));
		hs.add(new Item(3, "Chocos", 20));
		hs.add(new Item(4, "Ghee", 400));
		hs.add(new Item(5, "Colddrink", 25));
		hs.add(new Item(6, "Chips", 10));
		hs.add(new Item(2, "Flour", 34));
		
		for(Item i: hs)
		{
			System.out.println(i);
		}
		



	}

}
