package com.exception2;

public class CheckedExceptionPropagation3 {
	void method1() throws ClassNotFoundException
	{
		throw new ClassNotFoundException("Class error");
	}
	
	void method2() throws ClassNotFoundException
	{
		method1();
	}
	
	void method3()
	{
		try
		{
			method2();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckedExceptionPropagation3 obj1=new CheckedExceptionPropagation3();
		obj1.method3();

	}

}
