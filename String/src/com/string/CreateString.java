package com.string;

public class CreateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java";
		String s2="Java";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		
		System.out.println("=====================================");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		String s3="Hii";
		String s4=new String("Hii");
		
		System.out.println("=====================================");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

	}

}
