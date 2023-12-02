package com.stringAssign;



public class StringOperations {

	public static void main(String[] args){
		
		// TODO Auto-generated method stub
		//5. Write a Java program to find length of a string
		String s1="abc";
		System.out.println(s1.length());
		
		//6. Write a Java program to concatenate two strings
		String s2="def";
		System.out.println(s1+s2);
		
		//8. Write a Java program to convert lowercase string to uppercase.
		String s3="abcdef";
		System.out.println(s3.toUpperCase());
		
		//9. Write a Java program to copy one string to another string
		String s4=s1;
		System.out.println(s4);
		
		//10. WAP to split string into 2 tokens where string is “HELLO$WORLD”
		String str="HELLO$WORLD";
		String[] arrOfStr = str.split("\\$");
		for (String a : arrOfStr) {
            System.out.println(a);
		}
		
		
		//11. Write a Java program to find first occurrence of a character in a given string.
		String str1="Kailas Patil";
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='s') {
				System.out.println(i);
				break;
			}
		}
		
		
		//12. Write a Java program to count occurrences of a character in given string.
		int count=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='a') 
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
		//13. Write a Java program to trim leading white space characters in a string.
		s1="kailas   ";
		System.out.println(s1.trim());
		

		//14. Write a Java program to count total number of words in a string.
		s1="this is an update to";
		String[] arr1=s1.split(" ");
		System.out.println(arr1.length);
		
		
		
		//15. Write a Java program to find first occurrence of a word in a given string.
		for(String s:arr1) {
			if(s=="an") {
				System.out.println("found");
				break;
			}
		}
		
		//18.Write a Java program to remove all occurrences of a character from string.
		s1="abcabcabc";
		String ans=s1.replaceAll("a", "");
		System.out.println(ans);
	}
}

