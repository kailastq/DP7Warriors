package com.ternary;

public class BiggerNum {

	public static void main(String[] args) {
		int num1 = 62;
		int num2 = 22;

		int max;

		max = (num1 > num2) ? num1 : num2;

		System.out.println(max + " is greater ");

		if (num1 > num2)
		{
			max = num1;
		} 
		else 
		{
			max = num2;
		}
		System.out.println(max + " is greater");

	}

}
