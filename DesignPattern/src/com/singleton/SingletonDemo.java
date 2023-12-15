package com.singleton;

public class SingletonDemo {

	private static SingletonDemo obj = new SingletonDemo();
	
	public String msg;
	
	private SingletonDemo() {
		msg="Welcome";
	}
	
	public static SingletonDemo getInstance() {
		if(obj==null)
			new SingletonDemo();
		
		return obj;
	}
	
	public static void main(String[] args) {
		
		SingletonDemo s1 = new SingletonDemo().getInstance();
		SingletonDemo s2 = new SingletonDemo().getInstance();
		SingletonDemo s3 = new SingletonDemo().getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		s1.msg = "Hello";
		
		System.out.println(s1.msg);
		System.out.println(s2.msg);
		System.out.println(s3.msg);
	}
}