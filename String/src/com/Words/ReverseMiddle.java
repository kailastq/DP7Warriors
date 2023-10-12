package com.Words;

public class ReverseMiddle {
	static void reverseWord(String str) 
	{
		String splitst[] = str.split("\\s");
		String revstr = "";

		revstr = revstr = splitst[0] + " ";

		for (int i = 1; i < splitst.length; i++) 
		{
			for (int j = splitst[i].length() - 1; j >= 0; j--) 
			{
				revstr = revstr + splitst[i].charAt(j);
			}
			revstr = revstr + " ";
		}
		revstr = revstr + splitst[splitst.length - 1];
		System.out.println("After: " + revstr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I like to learn Java";
		System.out.println("Before: "+s);
		reverseWord(s);

	}

}
