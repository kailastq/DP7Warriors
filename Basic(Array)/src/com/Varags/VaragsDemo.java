package com.Varags;

public class VaragsDemo {
	static void display(int arr[])
	{
		for(int i: arr)
		{
			System.out.println(i+" ");
		}
		System.out.println();
	}
	
//	  " ... " -ellipsis
	
// Method overloaded ....  number of arguments
	
	static void displayElement(int ...a)
	{
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,6,8,9,4};
		int arr1[]= { 2,5,8,6,4,};
		int arr2[]= {9,8,7};
		
		
		display(arr);
		display(arr1);
		display(arr2);
		
		System.out.println("--------------------------------------------------");
		
		displayElement(7,9);
		displayElement(3,6,7);
		displayElement(4,2,6,8,0);
		
		

	}

}
