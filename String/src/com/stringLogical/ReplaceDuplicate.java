package com.stringLogical;

import java.util.Scanner;

public class ReplaceDuplicate {

	static String replaceDuplicate(String s) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i + 1; j < s.length(); j++) 
			{
				if (s.charAt(i) == s.charAt(j)) 
				{
					s.replace(s.charAt(j), '$');

				}
			}
		}
		return s;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word: ");
		String word = sc.next();
		System.out.println("original word: "+word);
		word=replaceDuplicate(word);
		System.out.println("New Word: "+word);
		//replaceDuplicate(word);
	}

}
