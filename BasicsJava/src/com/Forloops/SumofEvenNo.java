package com.Forloops;

public class SumofEvenNo {

	public static void main(String[] args) {
	     int sum=0;
		for(int i=1; i<=20;i++)
		{
			if(i%2==0)
			{
				sum+=i;     // sum=sum+i
			}
		}
		System.out.println(" Sum of even number is "+sum);

	}

}
