//WAP to create a Queue with Integer objects without using generics
package com.QueueAssign;

import java.util.LinkedList;
import java.util.Queue;

public class IntegerQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue mq=new LinkedList();
		
		mq.add((Integer) 10);
		mq.add((Integer) 20);
		mq.add((Integer) 30);
		mq.add((Integer) 40);
		
		
		System.out.println(mq);
		

	}

}
