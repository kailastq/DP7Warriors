package com.Containment;

public class Player {
	
	private int id;
	private String name;
	private Country c;
	
	Player(){
		
	}
	
	Player(int id , String name, Country c){
		this.id=id;
		this.name=name;
		this.c=c;
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

	public Country getC() {
		return c;
	}

	public void setC(Country c) {
		this.c = c;
	}
	
	public String toString() {
		return "\nPlayer Id: " + id + "\nPlayer name: " + name + "\nCountry: " + c ;
	}
		

}
