package com.encapsulation;

public class CustomerBank {
	private int cid;
	private String cname;
	private int accountno;
	private int credit;
	private int debit;
	private double balance;

	public int getCid() {
		return cid;
	}

	public void setC_id(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String Cname) {
		this.cname = Cname;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int Accountno) {
		this.accountno = Accountno;
	}
	

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getDebit() {
		return debit;
	}

	public void setDebit(int debit) {
		this.debit = debit;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double Balance) {
		this.balance = Balance;
	}

//	@Override
//	public String toString() {
//		return "CustomerBank [cid=" + cid + ", cname=" + cname + ", accountno=" + accountno + ", credit=" + credit
//				+ ", debit=" + debit + ", balance=" + balance + "]";
//	}
	
	

}
