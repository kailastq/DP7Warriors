package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SumofAlternate {
	static void Altrsum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
//			if (i % 2 != 0) 
			if(i % 2 == 0)				
			{
				sum = sum + arr[i];
			}
		}
		System.out.println("The sum of Alternate Number is: "+sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the Element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		Altrsum(arr);
		
	}

}
