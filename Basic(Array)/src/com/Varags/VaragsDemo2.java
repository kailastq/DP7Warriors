package com.Varags;

public class VaragsDemo2 {
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
	
	public static void display(Double ...s)
	{
		System.out.println("In double");
		for(Double st:s)
		{
			System.out.println(st);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display (7.4f, 6.5f);  // Float : Number :Object 

	}

}
