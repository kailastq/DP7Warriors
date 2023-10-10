package com.Abstract;

abstract class Animal {
	public abstract void makesound();

	public void eat() {
		System.out.println("The Animal is Eating..");
	}

//	Animal() {
//
//	}
	
}

class Tiger extends Animal {
	public void makesound() {
		System.out.println("Tiger is Roaring");
	}
}


public class Abstractclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t1 = new Tiger();
		t1.eat();
		t1.makesound();

	}

}
