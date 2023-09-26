package com.looplogic;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int GuessNo = 23;
		int count = 0;
		while (GuessNo!= 0)
		{    
		System.out.println("Enter your Guess number: ");
		int num = sc.nextInt();
		
		count++;

		if (num > GuessNo) 
		{
			System.out.println("You entered a greater number..");
		}
		else if (num < GuessNo)
		{
			System.out.println("You entered a smaller number..");
		} 
		else if (num == GuessNo) 
		{
			System.out.println("Congratulation, You Guess the right number..");
			System.out.println("Your total attemp: "+count);
			break;
			
		}

	}

}
}
