package com.Wrapper;

//wrapper class is non primitive data type
//Auto boxing is conversion of primitive to non primitive data type(object class)
//Unboxing is reverse to AutoBoxing

// Advantage of wrapper class collection, serialization, methods are in wrapper class (valueOf, parseInt)

public class WrapperclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 23;

		Integer i = new Integer(45);

		Integer i1 = 45;

		// convert
		Integer j = Integer.valueOf (num);

		Integer k = num;

		System.out.println(num + "  " + i + " " + j + " " + k);

		Float f1 = new Float(23.04f);

		float f2 = f1.floatValue();

		// unboxing - auto

		float f3 = f1; // compiler adds it. floatValue()

		System.out.println(f1 + " " + f2 + " " + f3);

	}

}
