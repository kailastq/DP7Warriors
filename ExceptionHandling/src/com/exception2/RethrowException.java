package com.exception2;

public class RethrowException {
	static void method1()
	{
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException ex)
		{
			System.out.println("In catch block of method1");
			throw ex;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			method1();
		}
		catch(NullPointerException e)
		{
			System.out.println("In main: "+e);
		}

	}

}
