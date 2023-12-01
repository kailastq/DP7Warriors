package com.stringLogical;

public class StringReverse {
	static void reverseSt(String s) 
	{
		String []str=s.split("\\s");
		System.out.print("after: ");
		for(int i=str.length-1;i>=0;i--) 
		{
			System.out.print(str[i]);
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		String st="i like to learn java";
		System.out.println("before: "+st);
		reverseSt(st);
		//before: i like to learn java
		//after: java learn to like i 
	}

}
//public class StringReverse
//{
//	static void reverseSt(String s)
//	{
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println("after: "+rev);
//	}
//	public static void main(String[] args)
//	{
//		String st="i like to learn java";
//		System.out.println("before: "+st);
//		reverseSt(st);
//		
//		/*
//		 before: i like to learn java
//         after:  avaj nrael ot ekil i
//		 */
//	}
//
//}