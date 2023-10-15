package com.StringBufferBuilder;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		
		sb1.append("Java Programs");
		
		//reverse
		System.out.println(sb1.reverse());
		
		//replace
		sb1.reverse();
		sb1.replace(0, 1, "p");
		
		System.out.println(sb1);
		sb1.replace(1, 4, "P");
		
		System.out.println(sb1);
		sb1.replace(0, 1, "Java");
		
		System.out.println(sb1);
		
		sb1.insert(6, "Developer");
		System.out.println(sb1);
		
		System.out.println(sb1.length());
		System.out.println(sb1.charAt(0));
		
		sb1.deleteCharAt(4);
		
		System.out.println(sb1);
		
		System.out.println(sb1.indexOf("Programs"));
		
		sb1.setCharAt(1, 'b');
		System.out.println(sb1);
		
		System.out.println(sb1.substring(3, 6));
		

	}

}
