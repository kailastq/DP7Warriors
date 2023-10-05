package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[ ]=new int[5];
		
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter the Value: ");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum is: "+sum);
		
		float ar[ ]= {36.5f, 16.5f, 45.2f, 86.4f };
		float sumj=0f;
		for(int j=0; j<arr.length;j++) {
			sumj=arr[j];
		}
		System.out.println("Float sum is: "+sum);
		

	}

}
