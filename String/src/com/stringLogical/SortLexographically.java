package com.stringLogical;

import java.util.Arrays;

public class SortLexographically {
	static void sort(String str[]) {
		for(int i=0; i<str.length;i++)
		{
			for(int j=i+1; j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
	}
	
	static void SortByLength(String st[])
	{
		for (int i=0; i<st.length;i++)
		{
			for(int j=i+1; j<st.length;j++)
			{
				if(st[i].length()>st[j].length())
				{
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"Amazon", "Meesho", "Flipkart", "Myntra", "Blinkit"};
		System.out.println("Before: "+Arrays.toString(str));
		
		
		sort(str);
		System.out.println("After: "+Arrays.toString(str));
		SortByLength(str);
				
	}

}
