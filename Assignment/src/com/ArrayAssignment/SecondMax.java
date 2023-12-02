//WAP to find 2nd maximum value in an array [20, 0, 31, 45, 100, 1, 105, 90]
package com.ArrayAssignment;

public class SecondMax{
	static void secondMax(int arr[]) {
		for(int i=0; i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
					if(arr[i]>arr[j])
					{
						 int temp=arr[i];
						 arr[i]=arr[j];
						 arr[ j ]=temp;
					}
			}
		//	System.out.println("");
		//	System.out.println("The Second Maximum number is: "+arr[arr.length-2]);
		}
		System.out.println("Second Max is: "+arr[arr.length-2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 20,0,31,45,100,1,105,90};
		secondMax(arr);
		

	}

}
