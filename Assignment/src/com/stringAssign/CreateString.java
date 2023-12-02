package com.stringAssign;

public class CreateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. String create with new operator and without new
		String s1="Apple";
		String s2= new String("Apple");
		System.out.println(s2+"  "+s1);
		
		//2. Compare string using == when we create without new see same reference is there
		String s3="Apple";
		System.out.println(s1==s3);
		
		
		//3. Compare string using new operator when new is present see different reference is there.
		String s4=new String("Apple");		
		System.out.println(s4==s3);
		
		
	}

}
