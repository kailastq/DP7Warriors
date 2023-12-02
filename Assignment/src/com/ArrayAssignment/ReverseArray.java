//WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your
//output must be [78, 37, 29, 45, 90, 3]
package com.ArrayAssignment;

import java.util.Arrays;

public class ReverseArray {
	static void printreverse (int arr[]) 
	{
		for(int i=arr.length-1; i>=0; i--) 
		{
			System.out.println(arr[i]);
			if(i<0) 
			{
				System.out.println(", ");
			}
		}
		System.out.println( );
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 90, 45, 29, 37, 78};
		printreverse(arr);
		

	}

}
