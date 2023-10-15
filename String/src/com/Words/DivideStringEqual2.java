package com.Words;

import java.util.Arrays;

public class DivideStringEqual2 {
	static void divideStr(String str, int noOfchar) {
		int len=str.length();  // 12
		
		//noOfchar: 5
		//number of subString
		
		if(len % noOfchar!=0)
		{
			// remainder: extra characters
			
			int x= noOfchar-(len%noOfchar);
			for(int i=0; i<x; i++)
			{
				str=str.concat("#");
			}
		}
		int n= str.length()/noOfchar;
		String spltstr[]=new String[n];
		int index=0;
		
		for(int i=0; i<str.length();i+= noOfchar)
		{
			spltstr[index]=str.substring(i, i+noOfchar);
			index++;
		}
		System.out.println(Arrays.toString(spltstr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"I", "am", "very", "smart"};
		String s1=String.join("", arr);
		
		//String s1="Iamverysmart";
		System.out.println(s1);
		
		int noOfchar = 5;
		
		divideStr(s1, noOfchar);
		
	}

}
