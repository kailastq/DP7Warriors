package com.Words;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A big cat rolling on big mat";
		System.out.println(str);
		
		//split Method
		String st[]= str.split("\\s"); // str.split(" ");
		System.out.println(Arrays.toString(st));

	}

}
