//Write a Java program to find the common elements between two arrays (int values)
//Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91,
//66, 22], so common between two arrays are 23 and 91 


package com.ArrayAssignment;

public class CommonElement {
	static void searchcommonelement(int arr[], int arr1[]) {
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr1.length; j++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.println(arr1[j]);
				}
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 12, 23, 34, 67 ,101, 78, 91, 56};
		int arr1[]= { 39, 25, 15, 23, 55, 91,66, 101,22};
		searchcommonelement(arr, arr1);
		

	}

}
