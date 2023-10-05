package com.Array;

public class FindMaxNumber {
	static void findmaxno(int ar[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		System.out.println("Maximum element is: " + max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 23, 52, 45, 14, 10 };
		findmaxno(arr);

	}

}
