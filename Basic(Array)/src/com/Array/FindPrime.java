package com.Array;

import java.util.Arrays;

public class FindPrime {
	static void printPrime(int arr[])
	{
		int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			boolean flag=true;
			for(int j=2;j<arr[i];j++) 
			{
				if(arr[i] % j == 0)
				{
					flag=false;
				//	break;
				}
			}
			if(flag)
			{
				System.out.println(arr[i]);
				sum=sum+arr[i];
			}
		}
		System.out.println("The addition of Prime number is: "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[ ]= {3,2,3,6,5,7,11};
		System.out.println(Arrays.toString(arr));
		printPrime(arr);
		

	}

}
