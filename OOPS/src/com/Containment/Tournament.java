package com.Containment;

public class Tournament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c1=new Country(1, "India" );
		Country c2=new Country(2, "South Africa");
		
		Player p1=new Player(18, "Virat", c1);
		Player p2=new Player(17, "ABD", c2);
		
		System.out.println(p1);
		System.out.println(p2);
		
		

	}

}
