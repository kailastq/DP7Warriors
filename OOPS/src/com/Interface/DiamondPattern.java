package com.Interface;

interface Grandfather {
	void loan();
}

interface Mother extends Grandfather {
	default void loan() {
		System.out.println("Mother pay the loan..");
	}
}

interface Father extends Grandfather {
	default void loan() {
		System.out.println("Father pay the loan..");
	}
}

class Son implements Mother, Father {

	@Override
	public void loan() {
		Father.super.loan();
		Mother.super.loan();
		System.out.println("Son pay the loan..");

	}

}

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.loan();

	}

}
