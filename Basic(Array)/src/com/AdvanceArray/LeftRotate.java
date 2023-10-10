package com.AdvanceArray;

import java.util.Arrays;

public class LeftRotate {
	static void rotateLeft(int arr[]) {
		int first = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {

			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = first;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 6, 4, 9, 7, 2, 8 };
		int n = 3;

		for (int j = 0; j < n; j++) {
			rotateLeft(arr);
		}
		System.out.println(Arrays.toString(arr));
	}
}
