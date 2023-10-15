package com.Words;

import java.util.Arrays;

public class DivideStringNotEqual {
	static void divideString(String st, int noOfchars) {
		int len = st.length(); // 12

		//noOfchar :5
		// number of substring
		int n = len / noOfchars; // 

		if (len % noOfchars != 0) {
			System.out.println("We cannot divide string in equal parts");
			
		} else {

			String spltstr[] = new String[n];

			int index = 0;

			for (int i = 0; i < len; i += noOfchars) {
				spltstr[index] = st.substring(i, i + noOfchars);
				index++;
			}

			System.out.println(Arrays.toString(spltstr));

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= { "I", "am", "very", "smart"};
		String s1=String.join("", arr);
		
		//String s1="Iamverysmart";
		 	
		System.out.println(s1);
		int noOfchars=5;
		divideString(s1, noOfchars);

	}

}
