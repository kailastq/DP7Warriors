package com.Interface;

interface Party{
	void party();
}

class BirthdayParty implements Party{
	public void party() {
		System.out.println("Its my Birthday Party");
	}
}

class BachelorParty implements Party{
	public void party() {
		System.out.println("Its my Bachelor Party");
	}
}


public class LooseCoupling1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthdayParty b1=new BirthdayParty();
		b1.party();
		
		BachelorParty b2=new BachelorParty();
		b2.party();

	}

}
