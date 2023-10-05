package com.Interface;

interface SweetShop {
	String sname = " Cake World ";   //it can be  public  static  final 

	abstract void bake();
}

interface Flavours {
	static  String flavour = "Vanilla";

	abstract void show();

}

class Cookies implements SweetShop, Flavours {

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("We made fresh cookies... ");

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("We serves a lot of Flavoured Cookies");
		
	}

}

class Cakes implements SweetShop, Flavours {

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("We bake fresh cakes");

	}

	public void show() {
		System.out.println("We have a lot of Flavours in cakes");
	}

	void order() {
		System.out.println("We takes order for the function ");
	}

}

public class BakeryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cookies c1 = new Cookies();
		c1.bake();
		c1.show();

		Cakes c2 = new Cakes();
		c2.bake();
		c2.show();
		c2.order();

	}

}
