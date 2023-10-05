package com.Polymorphism;

class Room{
	int len;
	int br;
	
	Room(){
		System.out.println("Default");
		len=5;
		br=5;
	}
	Room (int len, int br){
		System.out.println("Rectangle");
		this.len=len;
		this.br=br;
	}
	Room(int len){
		System.out.println("Square");
		this.len=len;
		System.out.println("Area of room is: "+(len*len));
		
	}
	void area() {
		
			System.out.println("Area of room is: "+(len*br));
		
	}
}

public class RoomConsOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r1=new Room();
		r1.area();
		
		Room r2=new Room(7);
		
		Room r3=new Room(12,15);
		r3.area();

	}

}
