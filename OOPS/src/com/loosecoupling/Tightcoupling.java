package com.loosecoupling;

interface MessageService {
	void SendMsg(String msg);
}

class Whatsapp1 implements MessageSer {
	String type;

	@Override
	public void SendMsg(String msg) {
		// TODO Auto-generated method stub
		this.type = "Whatsapp";
		System.out.println(type + " : " + msg);
	}
}

class Telegram1 implements MessageSer {
	String type;

	@Override
	public void SendMsg(String msg) {
		// TODO Auto-generated method stub
		this.type = "Telegram";
		System.out.println(type + " : " + msg);
	}

}

public class Tightcoupling {

	public void messagetype(Whatsapp w) {
		w.SendMsg("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tightcoupling obj = new Tightcoupling();
		Whatsapp w=new Whatsapp();
		
		obj.messagetype(w);
		
//		Telegram t=new Telegram();
//		obj.messagetype(t);

	}

}
