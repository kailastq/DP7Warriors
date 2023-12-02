package com.ArrayAssignment;

public class MissingNumber {
	
	public static int findmissing(int arr[], int n)
	{
		int expectedsum=(n *(n+1))/2;
		
		int actualsum=0;
		for(int num: arr)
		{
			actualsum=actualsum+num;
		}
		return expectedsum - actualsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 4, 6, 7};
	        
	        // Define the range (n) for the sequence
	        int n = 7; // For example, if the sequence is 1 to 7

	        int missingNumber = findmissing(arr, n);
	        
	        System.out.println("The missing number is: " + missingNumber);
	    }

	}

