package com.Static;

class Value {
	static int variable = 50;
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value.variable = 60;

		System.out.println("New Value is:" + Value.variable);

	}

}
