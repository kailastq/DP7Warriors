package com.stringLogical;

import java.util.Scanner;

public class ReplaceDuplicate2 {
	static String replaceDup(String st) {
		char ch[]=st.toCharArray();
		
		for(int i=0; i<ch.length;i++)
		{
			for(int j=i+1; j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='$';
				}
			}
		}
		st= new String(ch);
		return st;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word: ");
		String word=sc.next();
		
		System.out.println("Original Word: "+word);
		
		word=replaceDup(word);
		
		System.out.println("New Word: "+word);
		

	}

}
