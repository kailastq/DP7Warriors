package com.linkedhashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentLinkedHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Student,String> shm= new LinkedHashMap<>(12,0.8f);
		shm.put(new Student(101,"Anuj", 90),"Java");
		shm.put(new Student(107,"Vishal",87), "Python");
		shm.put(new Student(103,"Sahil", 56),"Java");
		shm.put(new Student(104,"Mira", 87),".net");
		shm.put(new Student(105,"Parul", 50),"Python");
		
		for(Map.Entry<Student, String> e: shm.entrySet())
		{
			System.out.println("Id:"+e.getKey());
			System.out.println("Details:"+e.getValue());
			System.out.println("---------------------------------------------------");
		}

	}

}
