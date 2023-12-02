package com.Classwork;

class Mobile {
	private int id;
	private String name;
	private int price;

	Mobile() {

	}

	Mobile(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void checkprice() {
		if (price > 25000) {
			System.out.println("Your Device is: " + name);
		}
	}

}

public class MobileInfo {
	public static void main(String[] args) {

		Mobile m1 = new Mobile(100, "Samsung", 17000);
		m1.checkprice();

		Mobile m2 = new Mobile(200, "Iphone", 60000);
		m2.checkprice();

		Mobile m3 = new Mobile(300, "Vivo", 26000);
		m3.checkprice();

	}

}
