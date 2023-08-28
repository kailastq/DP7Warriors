package com.ternary;

import java.util.Scanner;

public class Threenumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number: ");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		
		int max=(num1>num2)? (num1>num3 ?num1:num3) :(num2>num3 ? num2:num3);
		System.out.println("The greater number is:"+max);
		
		
		int max1=(num1>num2 && num1>num3) ? num1: (num2>num3 ?num2: num3);
		System.out.println("The greater number is :"+max1);

	}

}
