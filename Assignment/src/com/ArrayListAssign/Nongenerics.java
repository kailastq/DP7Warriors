package com.ArrayListAssign;

import java.util.ArrayList;
import java.util.Iterator;

public class Nongenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        ArrayList list = new ArrayList<>(); 

		        
		        list.add(1);
		        list.add(2);
		        list.add(3);
		        list.add("Kailash");

		        
		        Iterator itr = list.iterator();
		        while (itr.hasNext()) 
		        {
		            Object element = itr.next();
		            if (element instanceof Integer) 
		            {
		                System.out.println("Integer: " + element);
		            }
		        }
		    }

}

