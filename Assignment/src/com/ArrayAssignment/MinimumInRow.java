package com.ArrayAssignment;

public class MinimumInRow {
	static void minimum(int arr[][])
	{
		for(int i=0; i<arr.length; i++)
		{
			int min=arr[i][0];
			for(int j=1; j<arr[i].length; j++)
			{
				min=arr[i][j];
			}
			System.out.println("Minimum in row: "+(i+1)+ "-->"+min);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{22, 31, 9}, {46, 32, 15}};
		minimum(arr);
		
		

	}

}
