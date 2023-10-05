package com.Array;

import java.util.Arrays;

public class HalfAscendingOrder {
	static void sortAscending(int arr[])
	{
		int temp;
		for(int i=0; i<arr.length/2;i++)
		{
			for(int j=i+1; j<arr.length/2;j++)
			{
				if(arr[i] > arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			for(int j=arr.length-1; j<arr.length/2; j--)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 1,5,4,9,2,3,7,9,11,8};
		sortAscending(arr);
		

	}

}
