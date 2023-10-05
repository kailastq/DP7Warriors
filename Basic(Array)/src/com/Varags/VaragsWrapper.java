package com.Varags;

public class VaragsWrapper {
	
	public static void display(Object ...s)
	{
		System.out.println("In int");
		for(Object st:s)
		{
			System.out.println(st);
		}
	}
	
	public static void display(Number ...s)
	{
		System.out.println("In number");
		for(Number st:s)
		{
			System.out.println(st);
		}
	}
	
	public static void display(double ...s)
	{
		System.out.println("In double");
		for(Double st:s)
		{
			System.out.println(st);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		display(7.5f, 6, 3f);   // Float : Number : Object

	}

}
