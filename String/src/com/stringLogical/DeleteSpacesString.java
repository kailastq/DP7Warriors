package com.stringLogical;

public class DeleteSpacesString {
	static void deleteSpaces(String str)
	{
		for(int i=0; i<str.length();i++)
		{
			str=str.replaceAll("  "," ");
		}
		System.out.println(str.replaceAll(" ", " "));
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am  Kailash   Patil";
		deleteSpaces(s);
		

	}

}
