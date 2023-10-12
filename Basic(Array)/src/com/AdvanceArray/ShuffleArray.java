package com.AdvanceArray;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 6, 7, 9, 4, 3 };

		Random r = new Random();

		for (int i = 0; i < arr.length; i++) 
		{
			int temp =r.nextInt(arr.length);
			int r1=arr[temp];
			arr[temp] = arr[i];
			arr[i] = r1;

		}
		System.out.println(Arrays.toString(arr));
	}

}
