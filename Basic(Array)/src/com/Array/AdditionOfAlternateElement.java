package com.Array;

public class AdditionOfAlternateElement {
	static void ElementAddition(int arr[])
	{
		int sum=0;
		
		for(int i=0; i<arr.length/2;i++)
		{
			sum=arr[i]+arr[arr.length-1-i];
			System.out.println("Sum is: "+sum);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 1,3,5,4,5,12};
		ElementAddition(arr);
		

	}

}
