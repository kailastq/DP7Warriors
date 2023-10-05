package com.Static;

public class StaticNInstance {

	static int num1 = 0;
	int num2 = 23;
	int num3 = 14;

//	static void  addition()
//		{	  
//			 num2;  //we cannot access not static variable in non static method
//			
//		}

	void subtraction() {
		int sub = num1 + num2;  // yes we can access static variable in non static method
		System.out.println(sub);

	}

	void multiplication() {
		int mul = num2 * num3;  // yes we can access nonstatic variable in nonstatic method
		System.out.println(mul);
	}

	public static void main(String[] args) {
		System.out.println(StaticNInstance.num1);
		// yes we can access static variable in static method
		System.out.println(num1);

		StaticNInstance si = new StaticNInstance();
		System.out.println(si.num2);

	}

}
