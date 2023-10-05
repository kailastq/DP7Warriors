package com.Array;

public class FindSum3and5 {
	static void findsum(int arr[]) {
		int sum=0;
		for(int i: arr) {
			if(i%3==0 && i%5==0) 
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum of element which is divisible by 3 and 5 is: "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,60,16, 8, 10 };
		findsum(arr);

	}

}
