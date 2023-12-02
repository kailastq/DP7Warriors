package com.Constructor;

class Account{
	public long accountNo;
	public String customerName;
	
//	Account(){
//		System.out.println("I am Default Constructor");
//	}
	
	Account(long accountNo, String customerName){
		this.accountNo=accountNo;
		this.customerName=customerName;
	}
}

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac=new Account(38557645, "Kailash");
		System.out.println(ac.accountNo);
		System.out.println(ac.customerName);
		
//		Account ac1=new Account();  
		System.out.println("---------------------------------");
		
		
		Account a1=new Account(4456482, "Pawan");
		Account a2=new Account(5498434, "Aniket");
		
		System.out.println(a1.accountNo +"   " + a1.customerName);
		System.out.println(a2.accountNo +"   "+  a2.customerName);
		
// to print the data member we use "object name.data member" in sysoyt		
				

	}

}
