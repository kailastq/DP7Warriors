package com.accessmodifier;

public class AccessDemo {
	
	private int a;
	int b;
	public int c;
	
	private void show ()
	{
		System.out.println("Hello");
	}
	
	void display()
	{
		System.out.println("Welcome");
	}
	
	public void test()
	{
		System.out.println("Test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessDemo obj= new AccessDemo();
		obj.a=15;
		obj.b=10;
		obj.c=7;
		
		obj.show();
		obj.display();
		obj.test();

	}

}
