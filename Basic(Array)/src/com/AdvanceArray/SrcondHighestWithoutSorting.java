package com.AdvanceArray;

public class SrcondHighestWithoutSorting {
	static void SecondHigh(int arr[]) {
		
		int highest =Integer.MIN_VALUE;
		int sechighest=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>highest) 
			{
				sechighest=highest;
				highest=arr[i];
			}
			else if(arr[i]>sechighest)
			{
				sechighest=arr[i];
			}
	}
		System.out.println("Second Highest Number is" +sechighest);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 1,5,6,12,4,98};
		SecondHigh(arr);

	}

}
