//WAP to reverse the array itself, don’t print array in reverse – I want current array
//reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78,
//37, 29, 45, 90, 3] by using temporary array

package com.ArrayAssignment;

import java.util.Arrays;

public class ReverseArray2 {
	static void makereverse(int arr[]) {

//		for(int i=0; i<arr.length;i++) 
//		{
//			//System.out.println(arr[i]+" ");
//		}

		System.out.println(Arrays.toString(arr));
		System.out.println("-------------------------------");

		for (int i = arr.length - 1; i >= 0; i--)

		{
			System.out.print(" " + arr[i]);
		}
	//	System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 49, 45, 29, 37, 78 };
		makereverse(arr);

	}

}
