package com.AdvanceArray;

public class PairOfSum {
	static void FindPair(int arr[], int sum)
	{
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>sum)
				continue;
			for(int j=i+1; j<arr.length;j++)
			{
				if((arr[i]+arr[j])==sum)
				{
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 2,6,4,9,7,3,5,5};
		int sum=10;
		FindPair(arr,sum);
		

	}

}
