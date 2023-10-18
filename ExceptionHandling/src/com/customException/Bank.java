package com.customException;

class Account{
	private int id;
	private String name;
	private double balance;
	
	Account(){
		
	}
	
	Account(int id, String name, float balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	
	
	void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Amount deposited: "+amount);
		System.out.println("New Balance: "+balance);
	}
	
	void withdraw(double amount) {
		try
		{
			if((this.balance-amount)<0)
					throw new BalanceException("your balance is too low");
					this.balance=balance-amount;
					System.out.println("Amount withdrawn: "+amount);
					System.out.println("New Balance: "+balance);
		}
		catch(BalanceException b)
		{
			System.out.println(b);
		}
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		a.setId(100);
		a.setName("Kailash");
		a.setBalance(20000);
		
		a.withdraw(5000);
		a.deposit(3000);
		a.withdraw(500);
		

	}

}
