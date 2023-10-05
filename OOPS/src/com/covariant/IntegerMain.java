package com.covariant;

class Covariant
{
	Object show() 
	{
		return new Object();
	}
}

class SubCovariant extends Covariant{
	String show() 
	{
		return  "XYZ";
	}
}

class SubCovariant1 extends Covariant{
	Float show() {
	System.out.println(	super.show());
		return 10.5f;
	}
}

public class IntegerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Covariant c=new SubCovariant();
		System.out.println(c.show());
		
		Covariant c1=new SubCovariant();
		System.out.println(c1.show());
		
		SubCovariant1 c2=new SubCovariant1();
		System.out.println(c2.show());
		
		
		

	}

}
