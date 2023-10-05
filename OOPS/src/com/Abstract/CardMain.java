package com.Abstract;

abstract class Card {
	String type;
	int price;

	Card() {

	}

	Card(String type, int price) {
		this.type = type;
		this.price = price;
	}

	void show() {
		System.out.println("We make different type of Cards: ");
	}

	abstract void showCard();
}

class BirthdayCard extends Card {
	int date;

	BirthdayCard() {

	}

	BirthdayCard(String type, int price, int date) {
		super();
		this.date = date;
	}

	@Override
	void showCard() {
		// TODO Auto-generated method stub
		System.out.println("This is Birthday Card");
		System.out.println("Wishing you a very Happy Birthday");

	}

}

class WeddingCard extends Card {

	String place;

	WeddingCard() {

	}

	WeddingCard(String type, int price, String place) {
		super();
		this.place = place;
	}

	@Override
	void showCard() {
		// TODO Auto-generated method stub
		System.out.println("This is Wedding Invitation");
		System.out.println("Wedding Loaction is Mumbai");

	}

}

public class CardMain {

	public static void main(String[] args) {

		BirthdayCard b1 = new BirthdayCard("Birthday card", 500, 15);
		b1.showCard();

		WeddingCard w1 = new WeddingCard("Wedding card", 300, "Mumbai");
		w1.showCard();

	}
}
