package com.Words;

public class ReverseWordbyWord {
	static void reverseWord(String str)
	{
		String splitst[]=str.split("\\s");
		String revstr="";
		
		
		for(int i=0; i<splitst.length;i++)
		{
			for(int j=splitst[i].length()-1;j>=0;j--)
			{
				revstr=revstr+splitst[i].charAt(j);
			}
			revstr=revstr+" ";
		}
			System.out.println("After: "+revstr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I like to learn Java";
		System.out.println("Before: "+s);
		reverseWord(s);

	}

}
