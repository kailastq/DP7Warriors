package com.Array;

import java.util.Arrays;

public class SortingArray {
	static void SortArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				// Swapping
				if (arr[i] > arr[j]) // Ascending Order
//			 if(arr[i]< arr[j]) // Descending order
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 3, 8, 9, 12, 7, 4 };
		System.out.println("Before: "+ Arrays.toString(ar));
		
		SortArray(ar);
		System.out.println("After Sorting: "+ Arrays.toString(ar));
		
		System.out.println("The Second highest number is: "+ar[ar.length-2]);
		

	}

}
