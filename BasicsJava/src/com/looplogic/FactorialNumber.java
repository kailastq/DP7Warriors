package com.looplogic;

public class FactorialNumber {

	
		static void factNumber (int n) {
			
			long fact=1;
			for(int i=1; i<=n; i++)
			{
				fact*=i;
			}
			System.out.println("The factorial of "+n+ " is :"+fact);
			
			
		}
		public static void main(String []args) {
			
			factNumber(7);
			factNumber(5);
		}

	}


