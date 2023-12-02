package com.Classwork;

class Menu {
	private String type;

	Menu() {

	}

	Menu(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return type ;
	}
	

}

class Restaurant {
	private int id;
	private String name;
	private Menu m;
	static int count = 0;

	Restaurant() {

	}

	Restaurant(int id, String name, Menu m) {
		this.id = id;
		this.name = name;
		this.m = m;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Menu getM() {
		return m;
	}

	public void setM(Menu m) {
		this.m = m;
	}

	public String toString() {
		return "\nRestaurant Id: " + id + "\nName: " + name + "\nMenu: " + m;
	}

	void check(Restaurant r) {
		if (r.m.getType().equals("chinese")) {
			count++;
		}
	}

}

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu m1 = new Menu("Chinese");
		Menu m2 = new Menu("Indian");
		Menu m3 = new Menu("Mexican");

		Restaurant r1 = new Restaurant(100, "Kitchen 360", m1);
		Restaurant r2 = new Restaurant(101, "Star Hotel", m2);

		Restaurant r3 = new Restaurant(102, "Le Stone", m3);
		Restaurant r4 = new Restaurant(103, "Kailash Restaurants", m1);

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

		r1.check(r1);
		r2.check(r2);
		r3.check(r3);
		r4.check(r4);
		System.out.println(Restaurant.count);

	}

}
