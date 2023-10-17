package com.stringLogical;

import java.util.Scanner;

public class MakeShortName {
	static void shortName(String str)
	{
		String st[]=str.split(" ");
		String s=""; 

		for(int i=0; i<st.length; i++)
		{
			if(i==st.length-1)
			{
				s=s+st[i];
			}
			else
			{
				char ch=st[i].charAt(0);
				s=s+ch+".";
			}
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Full Name:");
		String name=sc.nextLine();
		
		shortName(name);
		
		
	}

}
