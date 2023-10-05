package com.Array;

public class SumofEvenArray {
	static int sumArray(int ar[]) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				sum += ar[i];
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[ ]= { 2,5,4,6,9};
		System.out.println("Sum of Even array is: "+sumArray(arr));

	}

}
