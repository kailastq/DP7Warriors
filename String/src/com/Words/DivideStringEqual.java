package com.Words;

import java.util.Arrays;

public class DivideStringEqual {
	static void divideString(String st, int noOfchar)
	{
		int len=st.length();
		
		//number of substring
		int n=len/noOfchar;
		
		String splitstr[]=new String[n];
		
		int index=0;
		
		for(int i=0; i<len; i+=noOfchar) {
			splitstr[index]=st.substring(i, i+noOfchar);
			index++;
		}
		System.out.println(Arrays.toString(splitstr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"I", "am", "very", "Smart"};
		int noOfchar=3;
		
		String s1=String.join("", s);
		divideString(s1, noOfchar);
		
	}

}
