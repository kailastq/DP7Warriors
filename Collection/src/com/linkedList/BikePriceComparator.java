package com.linkedList;

import java.util.Comparator;

public class BikePriceComparator implements Comparator<Bike>{

	@Override
	public int compare(Bike b1, Bike b2) {
		// TODO Auto-generated method stub
		if(b1.getPrice()==b2.getPrice())
		{
			return b1.getName().compareTo(b2.getName());
		}
		else
			return (int) (b2.getPrice()-b1.getPrice());
	}

}
