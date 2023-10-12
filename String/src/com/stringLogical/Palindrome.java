package com.stringLogical;

public class Palindrome {
	static void checkPalindrome(String str) {
		String originalword = str;
		String reverse="";
		
		for(int i=originalword.length()-1; i>=0; i--)
		{
			reverse=reverse +originalword.charAt(i);
		}
		
			if(originalword.equals(reverse))
			{
				System.out.println("It is Palindrome");
			}
			else
			{
				System.out.println("It is not Palindrome...");
			}
			
		}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		checkPalindrome(str);
		

	}

}
