//WAP to create a Queue with some colors (String) &amp; using generics
package com.QueueAssign;

import java.util.LinkedList;
import java.util.Queue;

public class StringQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> color=new LinkedList<>();
		
		color.add("Red");
		color.add("Black");
		color.add("Purple");
		color.add("Orange");
		
		System.out.println(color);
		
		String color1=color.poll();
		String color2=color.poll();
		String color3=color.poll();
		String color4=color.poll();
		
		System.out.println(color1+", "+color2+", "+color3+", "+color4);
		
		
		
		

	}

}
