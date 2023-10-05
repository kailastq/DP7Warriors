package com.Static;

public class StaticOverloading {
	
	public static void Method(int a)
	{
		System.out.println("Static Method: " +a);
	}
	
	public static void Method (int a, int b)
	{
		System.out.println("Non Static Method: "+ a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticOverloading.Method(5);
		StaticOverloading.Method(5, 6);

	}

}
