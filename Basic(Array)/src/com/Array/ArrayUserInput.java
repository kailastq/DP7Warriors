package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int num=sc.nextInt();
		
		int arr[ ]=new int[num];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Value: ");
			arr[i]=sc.nextInt();
		}
		System.out.println(arr); // prints hashcode
		System.out.println(Arrays.toString(arr)); }}
		
