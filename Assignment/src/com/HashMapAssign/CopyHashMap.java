//1. WAP to copy all of the mappings from the specified HashMap to another map

package com.HashMapAssign;

import java.util.HashMap;
import java.util.Map;

public class CopyHashMap {
	static void copyHashMap(Map<String, Integer> shm, Map<String, Integer> chm)
	 {
	        for (Map.Entry<String, Integer> entry : shm.entrySet()) 
	        {
	            chm.put(entry.getKey(), entry.getValue());
	        }
	 }


    public static void main(String[] args) {
    	
        HashMap<String, Integer> shm = new HashMap<>();
        shm.put("One", 1);
        shm.put("Two", 2);
        shm.put("Three", 3);

        HashMap<String, Integer> chm = new HashMap<>();

        
        copyHashMap(shm, chm);
        System.out.println(chm);
    }

       }

