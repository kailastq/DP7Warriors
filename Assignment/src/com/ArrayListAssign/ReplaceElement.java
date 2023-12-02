package com.ArrayListAssign;

import java.util.ArrayList;

public class ReplaceElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al1=new ArrayList<>();
		
		al1.add("Table");
		al1.add("Chair");
		al1.add("Bench");
		al1.add("Sofa");
		
		System.out.println(al1);
		
		al1.set(2, "Pen");
		
		System.out.println(al1);

	}

}
