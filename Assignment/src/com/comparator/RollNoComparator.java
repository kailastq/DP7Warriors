package com.comparator;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		// return Integer.compare(s1.getRollno(), s2.getRollno());
		if(s1.getRollno()>s2.getRollno())
			return 1;
		else
			if(s1.getRollno()<s2.getRollno())
				return -1;
			else
				return 0;
	}

}
