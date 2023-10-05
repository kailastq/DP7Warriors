package com.loosecoupling;

interface Payment{
	 public void doTransaction(double amount);

}

class CreditCard implements Payment{
	
	private int cardNo;
	private int cvv;
	private double limit;
	
	public CreditCard() {
		super();
	}
	
	
	public CreditCard(int cardNo, int cvv, double limit) {
		super();
		this.cardNo=cardNo;
		this.cvv=cvv;
		this.limit=limit;
	}

	@Override
	public void doTransaction(double amount) {
		// TODO Auto-generated method stub
		if((this.limit- amount)>0) {
			System.out.println("Credit Card is debit by: "+amount);
			this.limit=limit-amount;
		}
		else
		{
			System.out.println("Insufficient Balance: "+amount);
		}
		
	}
	
	public int getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(int CardNo) {
		this.cardNo=cardNo;
	}
	
	public double getLimit() {
		return limit;
	}
	
	public void setLimit(double limit) {
		this.limit=limit;
	}
	
}

class DebitCard implements Payment{
	private int cardno;
	private double balance;
	
	DebitCard(){
		super();
		
	}
	
	DebitCard(int cardno, double balance){
		super();
		this.cardno=cardno;
		this.balance=balance;
	}

	@Override
	public void doTransaction(double amount) {
		// TODO Auto-generated method stub
		if ((this.balance- amount)>=1000)
		{
			System.out.println("Debit card is debited by: "+amount);
			this.balance=balance-amount;
		}
		else
		{
			System.out.println("Insufficient Balance: "+this.balance);
		}
		
	}
	public int getCardno() {
		return cardno;
	}
	
	public void setCardno(int cardno) {
		this.cardno=cardno;
	}
}

public class OnlineShopping {
	
	String name;
	long mobileno;
	
	OnlineShopping(){
		
	}
	
	OnlineShopping(String name, long mobileno){
		super();
		this.name=name;
		this.mobileno=mobileno;
	}
	
	public void payBills(Payment p, int amount) {
		p.doTransaction(amount);
	}
	
	public void PayBill(Payment p, float amount, float discount) {
		amount=amount-((discount/100)*amount);
		p.doTransaction(amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnlineShopping os=new OnlineShopping("Kailash", 954786323);
		
		CreditCard c=new CreditCard(46551, 007, 55000);
		
		os.payBills(c, 45000);
		
		DebitCard d1=new DebitCard(90002, 80000);
		
		os.PayBill(d1, 3000, 10);
	}

}
