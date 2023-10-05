package com.Array;
import java.util.Scanner;

public class FindElement {
	static void FindArrayElement(int ar[], int num) {
		boolean flag=false;
		for(int i=0; i<ar.length; i++) {
			if(num==ar[i]) 
			{
				flag=true;
				System.out.println(num+" is present in array at position of: "+(i+1));
			}
		}
		
		if(flag==false) {
			System.out.println(num+ " is not present in array");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,8,2,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element you want: ");
		int n=sc.nextInt();
		FindArrayElement(arr, n);
		
		

	}

}
