package com.Array;

import java.util.Arrays;

public class FindfreqOfElement {
	static void checkfreq(int arr[]) {
		int count = 0;
		boolean flag;
		for (int i = 0; i < arr.length; i++)
		{
			count = 1;
			flag = false;

/// checking if the element compared: not a new element
			for (int j = i - 1; j >= 0; j--) 
			{
				if (arr[i] == arr[j]) 
				{
					flag = true;
					break;
				}
			}
			if (flag == false) 
			{
				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						count++;
					}
				}
				System.out.println(arr[i] + "------->" + count);
			}
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 6, 5, 5, 6, 2, 8, 7, 9 };
		checkfreq(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
