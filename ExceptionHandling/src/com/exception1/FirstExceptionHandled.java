package com.exception1;

public class FirstExceptionHandled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;

		try 
		{
			int ans = (x + y) / (x - y);
			System.out.println(ans);
		}
		
		//catch(ArithmeticException e)
		catch (Exception e) // no need to write exception name only we can write "Exception" here...
		{
			System.out.println(e+" Divide by zero exception");
		}
		
		System.out.println("----------------------------------------");
		
		int result=(2*x)+(2*y);
		
		System.out.println("Result: "+result);
	}

}
