package com.Static;

public class StaticVariable {
	int x=20;
	static int y=20;
	
	void instanceMethod()
	{
		x++;
		System.out.println("x: "+x);
		System.out.println("y:"+y);
	}
	static void staticMethod()
	{
		y++;
		System.out.println("y:"+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable s1=new StaticVariable();
		System.out.println("object s1");
		s1.instanceMethod();
		
		StaticVariable s2=new StaticVariable();
		System.out.println("object s2");
		s2.staticMethod();
		
		

	}

}
