package com.ArrayAssignment;

public class MaximumChar {
	static void max(char ar[]) {

		char maxchar = ar[0];

		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > maxchar) {
				maxchar = ar[i];

			}

		}

		System.out.println("Max character is: " + maxchar);

	}

	public static void main(String[] args) {
		char arr[] = { 'A', 'D', 'E', 'X', 'R', 'Z', 'p' };
		max(arr);

	}

}
