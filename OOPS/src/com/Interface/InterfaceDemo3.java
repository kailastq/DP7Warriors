package com.Interface;

interface A {
	void show();
}

interface B {
	void show();
}

class SimpleImplememt implements A, B {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Simple Implementation");

	}

}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new SimpleImplememt();
		a.show();
		
//		A a;
//		a= new SimpleImplememt();
//		a.show();
		
		
		B b = new SimpleImplememt();
		b.show();

	}

}
