// WAP to remove element from ArrayList
// WAP to remove all elements from ArrayList
// WAP to retain all elements from ArrayList
//WAP to empty ArrayList


package com.ArrayListAssign;

import java.util.ArrayList;

public class ArrayListMethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1=new ArrayList<>();
		
		System.out.println(al1.isEmpty());  //Empty ArrayList-returns boolean
		
		al1.add("Java");
		al1.add("Python");
		al1.add("Angular");
		al1.add("Spring");
		al1.add("Java");
		
		al1.remove(2);
		//System.out.println(al1);
		
		
		ArrayList<String> al2=new ArrayList<>(5);
		
		al2.add(".net");
		al2.add("Java");
		
		al1.retainAll(al2);//keeps only those elements which matches al2 and removes rest
		System.out.println(al1);
		
		System.out.println("-------------------------------------------");
		
		al1.removeAll(al2);//remove all elements which matches al3
		System.out.println(al1);
		
	

	}

}
