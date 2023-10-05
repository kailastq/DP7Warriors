package com.Varags;

public class VaragsOverLoading {
	static void display(int ...arr)
	{
		for(int i: arr)
		{
			System.out.println(i);
		}
	}
	
	static void display(double ...d1)
	{
		for(double d: d1)
		{
			System.out.println(d);
		}
	}
	
	static void display(String ...str)
	{
		for(String s: str)
		{
			System.out.println(s);
		}
	}
	
	
	static void displayMe(int x, char ...ch)
	{
		System.out.println(x);
		for(char c:ch)
		{
			System.out.println(c);
		}
		
	}
	
	static void displayMe(char x, int ...ch)
	{
		System.out.println(x);
		for(int c:ch)
		{
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(20,52,30);
		display(20.3, 96.4, 74.6);
		display("Kailash", "Anuj","Vishal");
///		display();   -Ambiguity issue
		
		displayMe('k', 8,6,5);
		displayMe(7, 'a','e','t');
//		displayMe(65,45,55,21);  //ambiguity due to type promotion

	}

}
