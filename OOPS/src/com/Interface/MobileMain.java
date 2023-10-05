package com.Interface;

interface Foldable{
	void  fold();
}

class Mobile{
	int ram;
	float price;
	String cname;
	
	Mobile(){
		
	}
	
	Mobile(int ram, float price, String cname){
		this.ram=ram;
		this.price=price;
		this.cname=cname;
	}
	
}

class OnePlus extends Mobile implements Foldable{
	
	String mname;
	
	OnePlus(){
		
	}
	
	OnePlus(int ram, float price, String cname, String mname){
		super();
		this.mname=mname;
	}

	@Override
	public void fold() {
		// TODO Auto-generated method stub
		System.out.println("We have a foldable Screen");	
	}
	void feature() {
		System.out.println("We have a flagship processor");
	}
}


public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnePlus m1=new OnePlus(8, 55000f, "oneplus","7t");
		m1.fold();
		m1.feature();

	}

}
