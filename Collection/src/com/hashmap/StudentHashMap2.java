package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap< Student, String> shm=new HashMap<>();
		
		shm.put(new Student(101, "Anuj", 90), "Java");
		shm.put(new Student(105, "Shivam", 89),"Python");
		shm.put(new Student(106, "Suraj", 56), "Java");
		shm.put(new Student(102, "Pawan", 70), ".net");
		System.out.println("Old data: "+shm.put(new Student(104, "Akash", 88), ".net"));
		shm.put(new Student(103, "Pralay", 92), "Python");
		

		
		for(Entry<Student, String> e: shm.entrySet())
		{
			System.out.println("Id: "+ e.getKey());
			
			System.out.println("Details: "+e.getValue());
			System.out.println("------------------------------------------------------");
		}
		
		

	}




}
