package com.Array;

public class UniqueElement {
	static void findUnique(int arr[]) {
		int count;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '\0')
				continue;
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '\0';
				}
			}
			if (count ==1) {
				System.out.println("Unique Element are: "+arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 6, 3, 3, 7, 9 };
		findUnique(arr);

	}

}
