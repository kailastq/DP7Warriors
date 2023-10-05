package com.Array;

import java.util.Arrays;

public class EvenOddArray 
{
	static void SeparateEvenOdd(int arr[]) 
	{

		int temp[] = new int[arr.length];
		int count = 0;
		

		for (int i = 0; i < arr.length; i++)

		{
			if (arr[i] % 2 == 0) 
			{
				temp[count] = arr[i];
				count++;
			}
		}

		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] % 2 != 0) 
			{
				temp[count] = arr[i];
				count++;
			}
		}
		
		System.out.println("output: "+Arrays.toString(temp));
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 6, 7, 9, 5, 11 };
		System.out.println(Arrays.toString(arr));
		
		
		SeparateEvenOdd(arr);

		
		

	}

}
