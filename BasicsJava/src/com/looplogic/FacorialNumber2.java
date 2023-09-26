package com.looplogic;

public class FacorialNumber2 {
	
	static long factNumber(int n) {
		long fact=1;
		for(int i=1; i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	public static void main(String args[]) {
		long ans;
		
		ans=factNumber(5);
		System.out.println("The factorial of 5 is:" +ans);
		
		ans=factNumber(7);
		System.out.println("The factorial of 7 is: " +ans);
		
		System.out.println("The factorial of 5 is:" +factNumber(5));
	}
	

}
