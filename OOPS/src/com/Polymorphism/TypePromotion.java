package com.Polymorphism;

public class TypePromotion {
	
	static void display(float n)
	{
		System.out.println("In float: ");
		System.out.println(n);
	}
	static void display (long n)
	{
		System.out.println("In long: ");
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(5); // here int got converted to float 
		display ('A'); // if float and int are present nearest
		// int float and long: promoted to long 

	}

}
