//Write a Java program to find the duplicate values of an array of integer values.
//Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78

package com.ArrayAssignment;

public class DuplicateNumber {
	static void findDuplicate(int arr[]) 
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 10, 90, 78, 56, 10, 78, 34, 61};
		findDuplicate(arr);
		

	}

}
