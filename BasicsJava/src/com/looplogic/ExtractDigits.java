package com.looplogic;

public class ExtractDigits {
	
	static void extract(int num)
	{
		System.out.println("The digit in the number "+num+ " are");
		while(num!=0)
		{
			System.out.println(num%10);
			num=num/10;
		}
	}
	public static void main(String args[]) {
		
		extract(5689);
		
		//reverse the number: i.e. 9865
	}

}
