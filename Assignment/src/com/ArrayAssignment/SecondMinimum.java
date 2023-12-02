//WAP to find 2nd minimum value in an array [-20, 0, -25, 15, 19, 37, 23] 
package com.ArrayAssignment;

public class SecondMinimum {
	static void secondMin(int arr[]) {
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Second Minimum is: "+arr[1]);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-20, 0, -25, 15, 19, 37, 23};
		secondMin(arr);

	}
}
