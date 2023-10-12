package com.innerDemo;

interface Doable {
	public void doIt();

}

class Car {
	public void drive() {
		System.out.println("I am driving a car");
	}

}

abstract class Cake {
	abstract void doBaking();

}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		// using interface

		Doable d = new Doable() {

			@Override
			public void doIt() {

				System.out.println("I am doing my homework");

			}
		};

		d.doIt();

		// using concrete class

		Car c1 = new Car() {
			public void drive() {
				System.out.println("I am driving a BMW");
			}

		};

		c1.drive();

		// using abstract class

		Cake ck1 = new Cake() {

			@Override
			void doBaking() {
				System.out.println("I am baking chocolate cake");

			}

		};

		ck1.doBaking();

	}
}
