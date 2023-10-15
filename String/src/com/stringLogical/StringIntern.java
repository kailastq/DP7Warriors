package com.stringLogical;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java";
		String s2=new String("Java");
		
		
		s2=s2.intern(); // to save memory space we perform intern method 
		                        // easy comparison, we can compare with "=="

	}

}
