package com.Interface;

interface Bank {
	void show();

	interface Locker {
		void showLocker();
	}
}

class SBI implements Bank, Bank.Locker {

	@Override
	public void showLocker() {
		// TODO Auto-generated method stub
		System.out.println("We provide the Lockers");

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("SBI Bank");

	}

}

public class NestedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();
		s.show();
		s.showLocker();

	}

}
