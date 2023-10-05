package com.covariant;

class Human{
	private int id;
	private String name;
	private float balance;

	Human() {

	}

	Human(int id, String name, float balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
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

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

//	public String toString() {
//		return "Id: " + id + "\nName: " + name + "\nBalance: " + balance;
//	}

}


class Paytm {
	static Human display() {
		Human  h=new Human();
		System.out.println(h);
		h.setId(100);
		h.setName("Kailash");
		h.setBalance(55000);
		return h;
	}
}


