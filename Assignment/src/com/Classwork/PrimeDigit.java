package com.Classwork;
import java.util.Scanner;


public class PrimeDigit {
		static void checkprime(int num) {
			int temp=num;
			int rem;
			
			System.out.println("The prime number in given digit is: ");
			while(temp!=0) {
				rem=temp%10;
				if(rem%2 != 0) {
					System.out.println(rem);
				}
				temp=temp/10;
			}
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number: ");
			int num=sc.nextInt();
			
			checkprime(num);
		}

}
