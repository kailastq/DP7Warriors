package com.ArrayAssignment;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 2,6,9,7,5};
		
		 Random r=new Random();
		 for(int i=0 ; i<arr.length; i++)
		 {
			 int temp=r.nextInt(arr.length);
			 int ran =arr[temp];
			 arr[temp] = arr[i];
			 arr[i]=ran;
		 }
		 
		 System.out.println(Arrays.toString(arr));
		 

	}

}
