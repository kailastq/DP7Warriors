package com.stringLogical;

import java.util.Arrays;

public class StringarraySort {
	static void sortLexo(String st[])
	{
		for(int i=0; i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].compareTo(st[j])>0)
				{
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}
	}
	
	static void sortLength(String str[]) {
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].length()>str[j].length())
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
	}
	
	static void sortLengthLexo(String str[]) {
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].length() == str[j].length()) {
					if (str[i].compareTo(str[j]) > 0) {
						String temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					} else {
						if (str[i].length() > str[j].length()) {
							String temp = str[i];
							str[i] = str[j];
							str[j] = temp;
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "C", "Aws", "Python", "Devops", "java" };
		// lexographically 
		System.out.println("Before Sort: " + Arrays.toString(str));
		sortLexo(str);
		System.out.println("After Sort: " + Arrays.toString(str));
		
		sortLength(str);
		System.out.println("After sort Length: "+Arrays.toString(str));
		
		System.out.println("===============================================");
		
		String str1[]= {"Java","C","Angular","Python","Html","Devops","C++"};
		
		sortLengthLexo(str1);
		
		System.out.println("After sort Length: "+Arrays.toString(str1));

	}

}
