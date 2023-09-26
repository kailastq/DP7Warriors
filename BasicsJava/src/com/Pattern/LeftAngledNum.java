package com.Pattern;

public class LeftAngledNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1; i<=n ;i++)
		{
			// for spaces
			for(int j=1; j<=(n-i);j++)
			{
				System.out.print("   ");
			}
			// for numbers
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}

	}

}
