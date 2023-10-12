package com.Words;

public class StringReverse {
	static void reverseString(String st)
	{
		String revstr="";
		for(int i=st.length()-1;i>=0;i--)
		{
			revstr=revstr+st.charAt(i);
		}
		System.out.println("After: "+revstr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I like to Play Cricket";
		System.out.println("Before: "+str);
		reverseString(str);
		

	}

}
