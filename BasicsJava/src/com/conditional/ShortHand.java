package com.conditional;

public class ShortHand {

	public static void main(String[] args) {
		
		byte b1=70;
		byte b2=12;
		
		b1=(byte)(b1+b2);
		
		System.out.println(b1);
		byte num1= 23;
		byte num2= 10;
		
		//num1=num1+num2;
		
		num1+=num2;    //removes type casting issues 
		
		System.out.println(num1);
		
		short s1=67;
		short s2=2;
		
		//s1=s1*s2

	}

}
