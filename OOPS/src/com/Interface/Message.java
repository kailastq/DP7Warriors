package com.Interface;

interface MsgService {
	void sendMsg();
}

class Whatsapp implements MsgService {
	public void sendMsg() {
		System.out.println("You Received a whatsapp msg");

	}
}

class Facebook implements MsgService {
	public void sendMsg() {
		System.out.println("Vishal sent you a friend request on Facebook");
	}

}

class Instagram implements MsgService {
	public void sendMsg() {
		System.out.println("Vishal started following you on Instagram");
	}
}

public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Whatsapp w = new Whatsapp();
		w.sendMsg();

		Facebook f = new Facebook();
		f.sendMsg();

		Instagram i = new Instagram();
		i.sendMsg();

	}

}
