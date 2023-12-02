// WAP to match two collections

package com.ArrayListAssign;

import java.util.ArrayList;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al1=new ArrayList<>();
		
		al1.add("Kailash");
		al1.add("Vishal");
		al1.add("Hrishi");
		al1.add("Shivam");
		
		ArrayList<String> al2=new ArrayList<>();
		
		al2.add("Suraj");
		al2.add("Pawan");		
		al2.add("Vishnu");
		al2.add("Kartik");
		
		boolean status=al1.containsAll(al2);
		
		if(status==true)
		{
			System.out.println("Both Collection are Same");
		}
		else
		{
			System.out.println("Both Collection are not same");
		}
	}

}
