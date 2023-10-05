package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageRainfall {
	static void AvgRain(int arr[]) {
		int avg = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("The Average rainfall is: "+avg);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the Value: ");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
	//	System.out.println(arr);
		AvgRain(arr);
		System.out.println(Arrays.toString(arr));

	}
}
