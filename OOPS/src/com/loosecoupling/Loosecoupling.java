package com.loosecoupling;

interface MessageSer {
	void SendMsg(String msg);
}

class Whatsapp implements MessageSer {
	String type;

	@Override
	public void SendMsg(String msg) {
		// TODO Auto-generated method stub
		this.type = "Whatsapp";
		System.out.println(type + " : " + msg);
	}
}

class Telegram implements MessageSer {
	String type;

	@Override
	public void SendMsg(String msg) {
		// TODO Auto-generated method stub
		this.type = "Telegram";
		System.out.println(type + " : " + msg);
	}

}

public class Loosecoupling {
	
	public void messagetype(MessageSer m) {
		m.SendMsg("Hello ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loosecoupling obj=new Loosecoupling();
		Whatsapp w=new Whatsapp();
		
		obj.messagetype(w);
		
		Telegram t=new Telegram();
		obj.messagetype(t);

	}

}
