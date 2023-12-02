package com.AccessModifier;

class A {
	private int i = 10;
	int j = 20;
	protected int k = 30;
	public int m = 40;

	void display() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}

}

class B extends A {
	A b = new A();

	void display() {
		System.out.println(b.j);
		System.out.println(b.k);
		System.out.println(b.m);
	}
}

class C extends A {
	A c = new A();

	void display() {
		System.out.println(c.j);
		System.out.println(c.k);
		System.out.println(c.m);
	}
}

public class Demo{
	public static void main(String[] args) {
		
		A a1=new A();
		a1.display();
		
		B b1=new B();
		b1.display();
		
		C c1=new C();
		c1.display();
				
	}
}