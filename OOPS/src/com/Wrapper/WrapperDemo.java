package com.Wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=26;
		
		char ch=65;
// parseInt return integer value 		
		
		int i=Integer.valueOf(num);
		System.out.println("value of i is: "+i);
		
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.valueOf("123"));
		
		char c=Character.valueOf(ch);
		System.out.println("Value of c: "+c);

	}

}
