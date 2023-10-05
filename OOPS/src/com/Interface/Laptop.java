package com.Interface;

interface Keyboard {
	void  display();
}

class Dell implements Keyboard {

	@Override
	public void  display() {
		// TODO Auto-generated method stub
		System.out.println("Dell Keyboard is very Expensive");
	}

}

class HP implements Keyboard {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("HP Keyboard is very good to use ");
	}

}

class Key {
	public void display(Keyboard k) {
		k.display();
	}
}

public class Laptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Keyboard k;
//		k=new Dell();
//		k.display();
		
		Key k=new Key();

		Keyboard k1 = new Dell();
		k1.display();
		
//		Dell d=new Dell();
//		k.display(d);

		Keyboard k2 = new HP();
		k2.display();
		
//		HP h=new HP();
//		k.display(h);

	}

}
