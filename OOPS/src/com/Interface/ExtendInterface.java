package com.Interface;

interface Movable{
	void move();
}

interface Printable extends Movable{
	void printMe(String name);
	
}

class Car implements Printable{
	public void move() {
		System.out.println("Car is moving with speed of :100kmph");
		
	}
	public void printMe(String name) {
		System.out.println("My car is :"+name);
	}
}

public class ExtendInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable m=new Car();
		m.move();
		
		Printable p =new Car ();
		p.move();
		p.printMe("Audi");

	}

}
