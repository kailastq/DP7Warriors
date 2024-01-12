package com.stringLogical;

import java.lang.reflect.Array;

public class RevStrArray {
	static void revArray(String st[]) {
		String rev="";
		for(int i =st.length-1;i>=0;i--) {
			String temp=st[i];
			
			
			for(int j=temp.length()-1;j>=0;j--)
			{
				rev=rev+temp.charAt(j);
			
			}
			
		}
		System.out.println("after: "+rev);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"one", "two", "three", "four"};
		revArray(str);
		
	

	}

}
