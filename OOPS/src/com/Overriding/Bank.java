package com.Overriding;

class Account {
	private int accno;
	private String name;
	protected float balance;
	protected float interestrate;

	public Account() {

	}

	public Account(int accno, String name, float balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
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

	public float getInterestrate() {
		interestrate = 5f;
		return interestrate;
	}
	

	void deposit(float amount) {
		balance += amount;
	}
	

	void withdraw(float amount) {
		if ((balance - amount) > 0) {
			balance -= amount;
		}
		else
		{
			System.out.println("Insuffient Balance: " + balance);
		}
	}
}



class Savingacc extends Account {
	private String pannumber;

	public Savingacc() {
		super();
	}

	public Savingacc(int accno, String name, float balance)
	{
		super(accno, name, balance);
	}
	

	public Savingacc(int accno, String name, float balance, String pannumber) {
		super(accno, name, balance);
		this.pannumber = pannumber;
	}

	public String getPannumber() {
		return pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public float getInterestrate() {
		interestrate = 8.5f;
		return interestrate;
	}

	void deposit(float amount) {
		float b = balance += amount;
		if (b > 50000) {
			if (pannumber != null) {
				balance = b;
			} else {
				System.out.println("Please Enter your pan number as your balance is getting above 50000");
			}
		}
	}

	void withdraw(float amount) {
		if ((balance - amount) > 1000) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance: " + balance);
		}
	}

}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(1011, "Kailash", 1000);

		System.out.println("Account Details: " + a1.getAccno() + " " + a1.getBalance());

		System.out.println("Rate: " + a1.getInterestrate());

		a1.withdraw(900);
		System.out.println("Balance: " + a1.getBalance());

		a1.deposit(65000);
		System.out.println("Balance: " + a1.getBalance());

		System.out.println("---------------------------------------");

		Savingacc s1 = new Savingacc(10211, "Neha", 20000);

		System.out.println("Account Details: " + s1.getAccno() + "Balance: " + s1.getBalance());

		System.out.println("Rate:" + s1.getInterestrate());

		s1.withdraw(19500);
		System.out.println("Balance:" + s1.getBalance());

		s1.deposit(67000);
		System.out.println("Balance:" + s1.getBalance());

		s1.setPannumber("AC90GH67");
		s1.deposit(67000);
		System.out.println("Balance:" + s1.getBalance());

	}

}
