package com.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentHashMap2 
{
	public static void sortByMarks(HashMap<Student,String> hm)
	{
		TreeMap<Student,String> tm=new TreeMap<>(new MarksComparator());
		tm.putAll(hm);
		
		for(Map.Entry<Student,String> e:tm.entrySet())
		{
			System.out.println(e.getKey()+"-----"+e.getValue());
		}
		
	}
	
	public static void main(String[] args) 
	{
		HashMap<Student,String> shm =new HashMap<>();
		
		shm.put(new Student(101,"Anuj",90),"Java");
		shm.put(new Student(107,"Vishal",87),"Python");
		shm.put(new Student(103,"Sahil",65),"Java");
		shm.put(new Student(104,"Mira",87),".net");
		shm.put(new Student(105,"Parul",60),"Python");
		
		for(Map.Entry<Student,String> e:shm.entrySet())
		{
			System.out.println(e.getKey()+"---"+e.getValue());
		}
		System.out.println("--------------------------------");
		
		sortByMarks(shm);
	}

}