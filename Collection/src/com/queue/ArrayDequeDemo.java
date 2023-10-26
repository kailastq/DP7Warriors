package com.queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Float> adq=new ArrayDeque<>();
		
		System.out.println(adq.peekFirst());
//		System.out.println(adq.getFirst());
		
		adq.addLast(null); // adq //not allows null
		adq.add(89.4f);
		adq.offerLast(96.5f);
		adq.addFirst(64.5f);
		
		
		// duplicate allowed
		// maintains insertion order
		System.out.println(adq);
		
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.pollLast());
		System.out.println(adq.removeFirst());
		
		adq.push(80.3f); // addfirst()
		
		System.out.println(adq);
		
		adq.push(67.5f);
		System.out.println(adq);
		
		System.out.println(adq.pop()); // removeFirst()

	}

}
