package com.string;

public class StringMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		

		System.out.println(s1.hashCode());
		s1 = "corejava";

		
		System.out.println(s1.hashCode()); // same hashcode
		System.out.println(s1);

		
		String s2 = "Kailash";
		System.out.println(s2.hashCode()); // same hashcode as of s1
		s2.concat("D"); // Kailash.concat("D");
		System.out.println(s2.hashCode());
		System.out.println(s2);

		
		String s3 = "Kailash";
		System.out.println(s3.hashCode()); //different hashcode
		s3 = s3.concat("D");
		System.out.println(s3.hashCode()); //different hashcode
		System.out.println(s3);

		
		String s4 = "KailashDapkekar";
		System.out.println(s4.hashCode()); //different hashcode
		System.out.println(s4);
		
		
//		int num=35;
//		System.out.println(num+35);
//		System.out.println(num);

	}

}
