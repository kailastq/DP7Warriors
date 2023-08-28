package com.conditional;

public class CharAddition {

	public static void main(String args[]) {

		char c1 = 65;
		char c2 = 2;

		char c3 = (char) (c1 + c2); // 67

		System.out.println(c3);

		int i1 = 97;
		int i3 = 3;

		char ch = (char) (i1 + 13);
		System.out.println(ch);

		char ch1 = '0';   // 48
		char ch2='5'; //53

		// 48+53-101]  :  101 is ascii value of e

		char result = (char) (ch1 + ch2);    // adds ascii value

		System.out.println(result);

	}

}
