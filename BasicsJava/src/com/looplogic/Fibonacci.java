package com.looplogic;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3;
		n1=0;
		n2=1;
		
		int count =20;
		System.out.print(n1+"  "+ n2+"  ");
		
		for(int i=1; i<=count;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}
		

	}

}
