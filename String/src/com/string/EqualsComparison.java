package com.string;

public class EqualsComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java";
		String s2="java";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("==================================");
		
		String s3=new String("hii");
		String s4=new String("hii");
		
		System.out.println(s3==s4);
		System.err.println(s3.equals(s4));
		
		// == compares reference of memory
		// equals - compare content
	}
	

}
