package com.Interface;

interface Bakery {
	String bname = "Cake World"; // it can be public static and final

	void bake(); // public abstract
}

class Cake implements Bakery {
	@Override
	public void bake() {
		System.out.println("We bake cakes: Butter, Vanilla, Chocolate");
	}
}

class Biscuit implements Bakery {
	public void bake() {
		System.out.println("We bake biscuit: Almond, Cashew");
	}

	void miniOrder() {
		System.out.println("Minimum order is 250gm");
	}
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bakery Name: " + Bakery.bname);
		Cake c = new Cake();
		c.bake();

		Biscuit b = new Biscuit();
		b.bake();
		b.miniOrder();

		Bakery b1=new Biscuit();
//		b1 = new Biscuit();
		b1.bake();
		// b1.miniOrder();

	}

}
