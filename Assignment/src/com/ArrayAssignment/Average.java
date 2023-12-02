package com.ArrayAssignment;


public class Average {

	static void avg(int arr1[], int sum) {
		int a = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
			a = sum / arr1.length;

		}
		System.out.println("Average: " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 12, 23, 34, 67, 78, 91, 56 };
		int sum = 0;
		avg(arr1, sum);

	}

}
