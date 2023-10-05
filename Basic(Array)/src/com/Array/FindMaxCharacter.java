package com.Array;

public class FindMaxCharacter {
	static char findMaxChar (char arr[]){
		char max=Character.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) 
			{
				max=arr[i];
			}
		}
		// System.out.println("Maximum character is: "+max);
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= { 'a', 'f', 't', 'e', 'q'};
		char c=findMaxChar(arr);
		System.out.println("Maximum char is: "+c);

	}

}
