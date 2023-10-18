package com.EnumDemo;

enum Season {
	SUMMER, WINTER, MONSOON
}

public class EnumDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season s = Season.SUMMER;

		switch (s) {
		case SUMMER:
			System.out.println("Wear cotton clothes");
			break;
		case WINTER:
			System.out.println("Wear wollen clothes");
			break;

		case MONSOON:
			System.out.println("Wear Raincoat");
			break;

		default:
			System.out.println("Error");

		}

	}

}
