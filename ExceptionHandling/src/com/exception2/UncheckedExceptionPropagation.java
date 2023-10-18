package com.exception2;

public class UncheckedExceptionPropagation {
	
	void method1()
	{
		int data=50/0;
	}
	
	void method2()
	{
		method1();
	}
	
	void method3()
	{
		method2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UncheckedExceptionPropagation obj1= new UncheckedExceptionPropagation();
		obj1.method3();
		

	}

}
