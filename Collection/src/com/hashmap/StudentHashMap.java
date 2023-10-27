package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Student> shm=new HashMap<>();
		
		shm.put(101,  new Student(101, "Anuj", 90));
		shm.put(105,  new Student(105, "Shivam", 89));
		shm.put(106,  new Student(106, "Suraj", 56));
		shm.put(102,  new Student(102, "Pawan", 70));
		System.out.println(shm.put(101,  new Student(104, "Akash", 88)));
		shm.put(103,  new Student(103, "Pralay", 92));
		
		
//		for(Map.Entry<Integer, Student> e: shm.entrySet())
//		{
//			System.out.println("Id: "+ e.getKey());
//			System.out.println("Details: "+ e.getValue());
//			System.out.println("---------------------------------------------------");
//		}
		
		for(Map.Entry<Integer, Student> e: shm.entrySet())
		{
			System.out.println("Id: "+ e.getKey());
//			Student s=e.getValue();
//			System.out.println("Details: "+s.getName());
			
			System.out.println("Details: "+e.getValue().getName()+"  "+e.getValue().getMarks());
			System.out.println("------------------------------------------------------");
		}
		
		

	}

}
