package com.Constructor;

class AccountInfo {
	int id;
	String name;
	double balance;

	AccountInfo() 
	{
		this(100, "Kailash");
	}

	AccountInfo(int id, String name) {
		this.id = id;
		this.name = name;
		balance = 1000.00;
	}

	void display() {
		String name = "Pawan";
		System.out.println(name);
		System.out.println(this.name);
	}
}
	public class AccountDetails {

		public static void main(String[] args) {
			AccountInfo acc = new AccountInfo();
			acc.display();
		}
	}


