package com.whileloop;

public class GreaterNumber {
	static void MaxNumber(int num) {
		int rem1= num % 10;
		int max=0;
		num=num/10;//9
		
		while (num != 0) {
			int rem2= num % 10;//8
			if (rem1> rem2) {
				max=rem1;
			}
			num = num / 10;
		}
		System.out.println(max+ " is maximum number");
	}

	public static void main(String[] args) 
	{
		int num = 5454689;
		MaxNumber(num);
	}

}
