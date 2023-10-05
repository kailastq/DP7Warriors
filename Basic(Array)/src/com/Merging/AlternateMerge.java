package com.Merging;
import java.util.Arrays;

public class AlternateMerge {
	
	static int[] mergeArray (int arr1[], int arr2[])
	{
		int mar[]=new int[ arr1.length + arr2.length];
		
		int index=0;
		int maxLength =Math.max(arr1.length, arr2.length);
		
		for(int i=0; i<maxLength; i++) 
		{
			if(i<arr1.length)
			{
				mar[index]=arr1[i];
				index++;
			}
			
			if(i<arr2.length)
			{
				mar[index]=arr2[i];
				index++;
			}
		}
		
	
		return mar;
		
	}
	
	static int[] margeArraySkip(int arr1[], int arr2[])
	{
		int maxLength = Math.max(arr1.length, arr2.length);
		int mar[]=new int[maxLength];
		
		int index=0;
		int i=0;
		
		while(index<maxLength)
		{
			if(i<arr1.length)
			{
				mar[index++]=arr1[i++];
			}
			
			if(i<arr2.length)
			{
				mar[index++]=arr2[i++];
			}
			
		}
		
		return mar;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,5,8};
		int arr2[]= {5,4,3,2};
		
		int mergeArray[]=mergeArray(arr1, arr2);
		
		System.out.println(Arrays.toString(mergeArray));
		
		int m[]=margeArraySkip(arr1, arr2);
		System.out.println(Arrays.toString(m));

	}

}
