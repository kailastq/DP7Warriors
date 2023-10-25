package com.linkedList;

import java.util.Comparator;

public class IdComparator implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b1.getId()-b2.getId();
	}
	

}
