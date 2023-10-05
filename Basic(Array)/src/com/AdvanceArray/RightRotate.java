package com.AdvanceArray;

import java.util.Arrays;

public class RightRotate {
	static void rotateOnce(int arr[])
	{
		int lastE=arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=lastE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 1,2,3,4,5,6};
		System.out.println("Before: ");
		System.out.println(Arrays.toString(arr));
		int n=3;
		for(int i=0; i<n; i++)
		{
			rotateOnce(arr);
		}
		System.out.println("After: ");
		System.out.println(Arrays.toString(arr));

	}

}
