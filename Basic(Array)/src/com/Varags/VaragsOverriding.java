package com.Varags;


//we cannot override a method with varags as arguement
class Parent 
{
	static void display(int ...arr)
	{
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}

class Child extends Parent
{
//	@Override
//	static void display(int ...arr)
//	{
//		int sum=0;
//		for(int i:arr)
//		{
//			sum=sum+i;
//		}
	}
	
	
public class VaragsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
